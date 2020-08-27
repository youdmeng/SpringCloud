package ml.ytooo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Youdmeng on 2020/8/19 0019.
 */
@SpringBootApplication
@MapperScan("ml.ytooo.**.dao")
@EnableEurekaClient
public class Payment8003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class, args);
    }
}
