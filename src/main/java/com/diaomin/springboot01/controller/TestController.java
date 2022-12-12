package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.pojo.Student;
import com.diaomin.springboot01.pojo.SysUser;
import com.diaomin.springboot01.service.SysUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private Student student;
    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/")
    public Student test() {
        return student;
    }

    /*@RequestMapping("/getAccount")
    public SysUser getAccount() {
        return sysUserService.selectByAccount("admin");
    }

    @GetMapping("/getAccountId")
    public SysUser testSelectById() {
        SysUser sysUser = sysUserService.selectByAccount("admin");
        return sysUser;
    }

    @GetMapping("/add")
    public Integer add() {
        SysUser sysUser=new SysUser();
        sysUser.setAccount("diaomin");
        sysUser.setRealName("貂悯");
        sysUser.setPassword("123321");
        return sysUserService.add(sysUser);
    }

    @GetMapping("/delete")
    public Integer deleteById(){
        return sysUserService.deleteById(18);
    }

    @GetMapping("/update")
    public Integer update(){
        SysUser sysUser=new SysUser();
        sysUser.setId(18);
        sysUser.setAccount("diaominyh");
        sysUser.setRealName("貂悯宇航");
        sysUser.setPassword(null);
        return sysUserService.update(sysUser);
    }*/



    /*@GetMapping("/getByAccount/{account}")
    public SysUser getByAccount(@PathVariable String account){
        return sysUserService.selectByAccount(account);
    }*/
}
