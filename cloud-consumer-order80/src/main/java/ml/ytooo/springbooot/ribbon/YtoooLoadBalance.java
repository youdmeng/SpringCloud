package ml.ytooo.springbooot.ribbon;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
@Component
public class YtoooLoadBalance implements LoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getIncreement() {
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current++;
        } while (!atomicInteger.compareAndSet(current, next));
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        if (serviceInstances.size() == 0) {
            return null;
        }
        int index =  getIncreement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
