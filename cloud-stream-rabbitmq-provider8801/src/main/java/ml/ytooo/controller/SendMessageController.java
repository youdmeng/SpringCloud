package ml.ytooo.controller;

import cn.hutool.core.util.IdUtil;
import ml.ytooo.service.MsgProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    @Resource
    private MsgProvider messageProvider;

    @GetMapping(value = "/send")
    public String sendMessage() {
        return messageProvider.send(IdUtil.simpleUUID());
    }

}
