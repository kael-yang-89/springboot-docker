package com.yang.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * package:com.yang.springboot.rabbitmq
 * author:yang
 * date: 2019/4/14  0:01
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
/*@Component
@RabbitListener(queues="hello")*/
public class Receiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Receiver:"+ msg);
    }
}
