package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix

public class HystrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80.class, args);
    }
}
