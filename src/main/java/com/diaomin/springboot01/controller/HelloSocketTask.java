package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.Task.SocketTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloSocketTask {
    @Resource
    private SocketTask socketTask;

    @RequestMapping("/seyHello")
    public String seyHello(){
        String str = socketTask.dotask();
        System.out.println("str="+str);//str==null,因为此时sayHello()方法还未执行。
        return "欢迎进入SpringBoot世界!666";
    }
}
