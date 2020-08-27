package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by Youdmeng on 2020/8/24 0024.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixProvider8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixProvider8001.class, args);
    }
}
