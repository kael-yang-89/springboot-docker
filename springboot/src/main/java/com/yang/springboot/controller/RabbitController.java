package com.yang.springboot.controller;

import com.yang.springboot.rabbitmq.Receiver;
import com.yang.springboot.rabbitmq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package:com.yang.springboot.controller
 * author:yang
 * date: 2019/4/14  0:16
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@RestController
public class RabbitController {

   /* @Autowired
    private Sender sender;
    @Autowired
    private Receiver receiver;

    @RequestMapping("/send")
    public void  sendMsg(){
        sender.send();
        //receiver.process();
    }*/


}
