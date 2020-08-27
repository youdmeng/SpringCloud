package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/19 0019.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZooOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ZooOrder80.class, args);
    }
}
