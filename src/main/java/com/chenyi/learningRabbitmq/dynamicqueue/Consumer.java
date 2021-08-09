package com.chenyi.learningRabbitmq.dynamicqueue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@EnableBinding(MySink.class)
public class Consumer {
    /*********************************动态通道选择示例******************************/
    @StreamListener(value = MySink.DYNAMIC1_CHANNEL)
    public void dynamic1Receiver(@Payload User user) {
        log.info("Received-{} from {} channel age: {}", active, MySink.DYNAMIC1_CHANNEL, user.getAge());
    }

    @StreamListener(value = MySink.DYNAMIC2_CHANNEL)
    public void dynamic2Receiver(@Payload User user) {
        log.info("Received-{} from {} channel age: {}", active, MySink.DYNAMIC2_CHANNEL, user.getAge());
    }
}
