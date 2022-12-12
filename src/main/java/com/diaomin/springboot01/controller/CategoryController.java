package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.dao.CategoryMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/element-ui-manager")
public class CategoryController {

    @GetMapping("/categories")
    public void Category(Integer levels){

    }
}
