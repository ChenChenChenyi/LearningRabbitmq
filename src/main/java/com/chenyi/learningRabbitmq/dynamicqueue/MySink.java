package com.chenyi.learningRabbitmq.dynamicqueue;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
    /*********************************动态通道选择示例******************************/
    String DYNAMIC1_CHANNEL = "dynamic1-channel";
    String DYNAMIC2_CHANNEL = "dynamic2-channel";

    @Input(DYNAMIC1_CHANNEL)
    SubscribableChannel dynamic1Input();

    @Input(DYNAMIC2_CHANNEL)
    SubscribableChannel dynamic2Input();
}
