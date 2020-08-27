package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/25 0025.
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigBus3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBus3366.class, args);
    }
}
