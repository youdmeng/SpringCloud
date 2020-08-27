package ml.ytooo.springbooot.rest;

import lombok.extern.slf4j.Slf4j;
import ml.ytooo.http.Response;
import ml.ytooo.http.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
@RestController
@Slf4j
public class Api {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/info")
    public Response info() {
        return Result.success("查询成功 端口: [" + port + "]");
    }


}
