package ml.ytooo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@RestController
@RefreshScope
public class Controller {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/test")
    public String test() {
        return configInfo;
    }
}
