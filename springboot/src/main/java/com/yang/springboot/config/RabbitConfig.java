package com.yang.springboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * package:com.yang.springboot.config
 * author:yang
 * date: 2019/4/14  0:05
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }


}

