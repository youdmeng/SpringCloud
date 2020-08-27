package ml.ytooo.springbooot.rest;

import lombok.extern.slf4j.Slf4j;
import ml.ytooo.entity.Payment;
import ml.ytooo.http.Response;
import ml.ytooo.http.Result;
import ml.ytooo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public Response create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);

        if (result > 0) {
            return Result.success(200, "插入数据库成功,serverPort: " + serverPort, result);
        } else {
            return Result.success(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public Response<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return Result.success(200, "查询成功,serverPort:  " + serverPort, payment);
        } else {
            return Result.success(444, "没有对应记录,查询ID: " + id, null);
        }
    }

    @PostMapping("/sleep")
    public Response sleep()throws Exception {
        Thread.sleep(10000);
        return Result.success();
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {

        discoveryClient.getServices().forEach(yo -> {
            log.info("service: " + yo);
        });

        discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE").forEach(yo -> {
            log.info(yo.getHost() + "|" + yo.getUri() + "|");
        });
        return this.discoveryClient;
    }

}
