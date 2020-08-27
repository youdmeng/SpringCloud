package ml.ytooo.springbooot.rest;

import ml.ytooo.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Youdmeng on 2020/8/19 0019.
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/select")
    public Response select() {
        return template.getForObject("http://zookeeper-payment-provider/info", Response.class);
    }



}
