package com.diaomin.springboot01.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
//@EnableScheduling
public class SimpleTask {
    @Autowired
    private MyTask myTask;
    @Resource
    private SimpleDateFormat dateFormat;

    @Scheduled(fixedRate = 1000 * 3) //每隔三秒
    public void reportCurrentTime() {
        myTask.say();//执行任务方法
        System.out.println("每隔3秒任务调度一次 现在时间 " + dateFormat.format
                (new Date()));
    }

    @Scheduled(cron = "*/5 * * * * ? ") //每隔5秒（cron表达式，六个*【*/5算一个，？算一个】，从左到右分别为秒分时天月年，具体详情可以参考度娘学习
    public void reportCurrentByCron() {
        System.out.println("每隔5秒任务调度一次 Scheduling Tasks Examples By Cron: The time is now " + dateFormat.format(new Date()));
    }
}
