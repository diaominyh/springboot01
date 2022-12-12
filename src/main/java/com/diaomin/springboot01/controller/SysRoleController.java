package com.diaomin.springboot01.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diaomin.springboot01.dao.SysRoleMapper;
import com.diaomin.springboot01.pojo.SysRole;
import com.diaomin.springboot01.service.SysRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 系统角色 前端控制器
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {
    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("/getSysRolePage")
    public IPage<SysRole> getSysRolePage() {
        Page<SysRole> page=new Page<>(2,2);
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("code", "SMBMS");
        IPage<SysRole> sysRoleIPage = sysRoleService.page(page, queryWrapper);
        sysRoleIPage.getTotal();//总条数
        sysRoleIPage.getPages();//总页数
        sysRoleIPage.getSize();//每页显示条数
        sysRoleIPage.getCurrent();//当前页
        sysRoleIPage.getRecords();//记录
        return sysRoleIPage;
    }
}

