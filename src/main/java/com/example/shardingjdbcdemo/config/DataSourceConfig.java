package com.example.shardingjdbcdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DataSource
 * @Description TODO
 * @Author Administrator
 * @Date 2022/2/28 11:26
 **/
//@Configuration
public class DataSourceConfig {
//    @Resource
    private DataSource dataSource;

//    @Bean("dataSource")
    public DataSource dataSource(){
        Map<String, DataSource> dataSourceMap = new HashMap<>(1);

        return dataSource;
    }
}
