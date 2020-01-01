package com.yang.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * package:com.yang.springboot.config
 * author:yang
 * date: 2019/2/27  9:31
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@EnableTransactionManagement
@Configuration
@PropertySource(value = "classpath:/config/jdbc-config.properties",
        ignoreResourceNotFound = false,
        encoding = "UTF-8",
        name = "jdbc-config.propertiesg")
public class DataSourceConfiguration {

    @Bean(name = "myDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "druidDataSource")
    public DruidDataSource myDataSource() {
        DruidDataSource druidDataSource = dataSourceProperties().initializeDataSourceBuilder().type(DruidDataSource.class).build();
        return druidDataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory mySqlSessionFactory(@Qualifier("druidDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/dao/*.xml"));
        bean.setConfigLocation(new DefaultResourceLoader().getResource("classpath:/mybatis-config.xml"));
        return bean.getObject();
    }

}
