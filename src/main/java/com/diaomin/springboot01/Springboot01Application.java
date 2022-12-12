package com.diaomin.springboot01;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan("com.diaomin.springboot01.dao")
@EnableCaching//开启缓存
public class Springboot01Application {
    public static void main(String[] args) {
        //SpringApplication.run(Springboot01Application.class, args);
        SpringApplication springApplication =new SpringApplication(Springboot01Application.class);
        //禁止命令行设置参数
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }

    /*
    * IPage分页插件
    * 无此插件返回total和pages
    * */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
