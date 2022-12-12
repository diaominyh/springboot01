package com.diaomin.springboot01.Task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SocketTask {
    @Async
    public String dotask(){
        try{
            Thread.sleep(5000);//程序睡眠5秒中之后在执行
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("sayHello执行了...");
        return "sayHello";
    }
}
