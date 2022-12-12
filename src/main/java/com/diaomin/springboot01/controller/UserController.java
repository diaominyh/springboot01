package com.diaomin.springboot01.controller;

import com.diaomin.springboot01.pojo.SysUser;
import com.diaomin.springboot01.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/userBy")
    public String getAllUser(Model model) {
        //SysUser sysUser = sysUserService.selectByAccount("admin");
        //System.out.println(userList);
        //model.addAttribute("sysUser", sysUser);
        return "userList";
    }
}
