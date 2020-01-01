package com.yang.springboot.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * package:com.yang.springboot.entity
 * author:yang
 * date: 2019/2/27  11:44
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */

public class DruidConfigBean {
    private String url;
    private String username;
    private String password;
    private String driverClass;


}
