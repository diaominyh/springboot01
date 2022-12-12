package com.diaomin.springboot01.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diaomin.springboot01.dao.SysUserMapper;
import com.diaomin.springboot01.pojo.SysUser;
import com.diaomin.springboot01.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @PostMapping("/add")
    public Boolean add(@RequestBody SysUser sysUser) {
        return sysUserService.save(sysUser);
    }

    @GetMapping("/getPage")
    public IPage<SysUser> getUserPage(Integer current/*当前页*/, Integer size/*每页条数*/) {
        Page<SysUser> page = new Page<>(current, size);
        return sysUserService.page(page);
    }

    @RequestMapping("/getAll")
    public List<SysUser> getAll(){
        return sysUserService.list();
    }
}

