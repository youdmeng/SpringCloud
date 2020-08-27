package ml.ytooo.springbooot.ribbon;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
