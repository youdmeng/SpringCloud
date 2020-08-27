package ml.ytooo.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@EnableBinding(Sink.class)
public class ReceiveMsg {

    @StreamListener(Sink.INPUT)
    public void receive(Message<String> message) {
        System.out.println("客服端8802收到消息: " + message.getPayload());
    }
}
