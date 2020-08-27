package ml.ytooo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@Service
    @FeignClient(value = "CLOUD-PROVIDER-HYSTYRIX-PAYMENT",fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
