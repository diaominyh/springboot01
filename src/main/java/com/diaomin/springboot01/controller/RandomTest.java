package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.pojo.RandomConfig;
import com.diaomin.springboot01.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class RandomTest {
    @Resource
    private RandomConfig randomConfig;

    @RequestMapping("/randomTest")
    public RandomConfig test(){
        return randomConfig;
    }
}
