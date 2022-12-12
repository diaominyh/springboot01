package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.util.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/weixin")
public class WeiXinLoginController {
    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> wxLogin(@RequestParam("code") String code) {
        String appid = "wx44a0c63e105a49a8";
        String secret = "7d367499d5e60a15cbad04d2661a9558";
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid +
                "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        String respStr = HttpClientUtil.doGet(url);//发送请求
        System.out.println(respStr);
        Map<String, Object> resultMap = new HashMap<>();//计划返回结果
        if (respStr.contains("errcode")) {
            resultMap.put("status", 500);
            return resultMap;
        }
        resultMap.put("status", 200);
        resultMap.put("ticket", UUID.randomUUID());
        return resultMap;
    }
}
