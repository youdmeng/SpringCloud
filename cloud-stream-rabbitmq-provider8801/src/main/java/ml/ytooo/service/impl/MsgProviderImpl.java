package ml.ytooo.service.impl;

import lombok.extern.slf4j.Slf4j;
import ml.ytooo.service.MsgProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/25 0025.
 */
@EnableBinding(Source.class) //定义消息推送管道
@Slf4j
public class MsgProviderImpl implements MsgProvider {

    @Resource
    private MessageChannel output; //定义消息发送管道

    @Override
    public String send(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();

        output.send(message);

        return null;
    }

}
