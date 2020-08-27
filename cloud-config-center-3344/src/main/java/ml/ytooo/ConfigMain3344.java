package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3344.class, args);
    }
}
