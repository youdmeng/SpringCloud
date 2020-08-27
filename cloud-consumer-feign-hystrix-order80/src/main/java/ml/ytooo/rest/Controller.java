package ml.ytooo.rest;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import ml.ytooo.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "globle",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
})
public class Controller {

    @Resource
    private FeignService feignService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = feignService.paymentInfo_OK(id);
        log.info("*****result: " + result);
        return result;
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOut_Handler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = feignService.paymentInfo_TimeOut(id);
        log.info("*****result: " + result);
        return result;
    }


    public String paymentInfo_TimeOut_Handler(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfo_TimeOut_Handler,id:  " + id + "\t" + "o(╥﹏╥)opppppppppppppppppppp";
    }
    public String globle() {
        return "全局";
    }
}
