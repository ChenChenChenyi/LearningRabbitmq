package com.chenyi.learningRabbitmq.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@Slf4j
@EnableBinding(OrderChannelProcessor.class)
public class OrderMessageProducer {
    @Autowired
    private OrderChannelProcessor orderChannelProcessor;
    /**
     * 发送消息
     *
     * @param msg
     */
    public void sendMsg(String msg) {
        orderChannelProcessor.saveOrderOutput().send(MessageBuilder.withPayload(msg).build());
        log.info("消息发送成功：" + msg);
    }
}
