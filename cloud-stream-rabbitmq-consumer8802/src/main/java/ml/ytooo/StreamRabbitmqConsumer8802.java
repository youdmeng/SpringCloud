package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitmqConsumer8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitmqConsumer8802.class, args);
    }
}
