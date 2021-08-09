package com.chenyi.learningRabbitmq.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@Slf4j
@EnableBinding(OrderChannelProcessor.class)
public class OrderMessageConsumer {
    /**
     * 保存订单逻辑
     * 通过OrderChannelProcessor.SAVE_ORDER接收消息
     * 然后通过SendTo 将处理后的消息发送到 OrderChannelProcessor.ORDER
     *
     * @param message
     * @return
     */
    @StreamListener(OrderChannelProcessor.SAVE_ORDER_INPUT)
    //@SendTo(OrderOutputChannelProcessor.ORDER_OUTPUT)
    public void saveOrderMessage(Message<String> message) {
        log.info("保存订单的消息：" + message);
    }
}
