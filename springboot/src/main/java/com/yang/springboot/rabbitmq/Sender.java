package com.yang.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * package:com.yang.springboot.rabbitmq
 * author:yang
 * date: 2019/4/13  23:57
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
//@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String data="hello"+new Date();
        System.out.println("Sender:"+data);
        this.amqpTemplate.convertAndSend("hello",data);
    }

}
