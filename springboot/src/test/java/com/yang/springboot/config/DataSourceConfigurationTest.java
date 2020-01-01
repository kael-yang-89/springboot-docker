package com.yang.springboot.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * package:com.yang.springboot.config
 * author:yang
 * date: 2019/2/27  11:51
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceConfigurationTest {
    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void getDataSource() throws Exception {
        DataSourceConfiguration bean = applicationContext.getBean(DataSourceConfiguration.class);
        System.out.println(bean.dataSourceProperties().getDriverClassName());
        System.out.println(bean.myDataSource().getDriverClassName());
        System.out.println(bean.myDataSource().getClass().getName());
        System.out.println(bean.myDataSource().getUrl());
        System.out.println(bean.myDataSource().getMaxActive());
    }

}