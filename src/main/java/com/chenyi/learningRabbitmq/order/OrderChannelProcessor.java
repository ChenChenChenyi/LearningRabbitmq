package com.chenyi.learningRabbitmq.order;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface OrderChannelProcessor {
    /**
     * 保存订单输出通道（需要与配置文件中的保持一致）
     */
    String SAVE_ORDER_OUTPUT ="saveOrderOutput";
    /**
     * 保存订单输出
     *
     * @return
     */
    @Output(SAVE_ORDER_OUTPUT)
    MessageChannel saveOrderOutput();

    /**
     * 保存订单输入通道（需要与配置文件中的保持一致）
     */
    String SAVE_ORDER_INPUT ="saveOrderInput";

    /**
     * 保存订单输入方法
     *
     * @return
     */
    @Input(SAVE_ORDER_INPUT)
    SubscribableChannel saveOrderInput();
}
