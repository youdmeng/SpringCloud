package ml.ytooo.feignservice;

import ml.ytooo.entity.Payment;
import ml.ytooo.http.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface Service {
    @GetMapping(value = "/payment/get/{id}")
    Response<Payment> getPaymentById(@PathVariable("id") Long id);

    @PostMapping("/sleep")
    Response sleep();
}
