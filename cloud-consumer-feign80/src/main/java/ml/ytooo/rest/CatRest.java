package ml.ytooo.rest;

import lombok.extern.slf4j.Slf4j;
import ml.ytooo.feignservice.Service;
import ml.ytooo.http.Response;
import ml.ytooo.http.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
@RestController
@Slf4j
public class CatRest {

    @Autowired
    private Service service;

    @GetMapping(value = "/select")
    public Response hello() {
        return service.getPaymentById(1L);
    }

}
