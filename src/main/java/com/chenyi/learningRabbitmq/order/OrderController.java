package com.chenyi.learningRabbitmq.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderMessageProducer orderMessageProducer;

    /**
     * 发送保存订单消息
     *
     * @param message
     */
    @GetMapping(value = "/sendSaveOrderMessage")
    public void sendSaveOrderMessage(@RequestParam("message") String message) {
        //发送消息
        orderMessageProducer.sendMsg(message);
        log.info("发送保存订单消息成功");
    }
}
