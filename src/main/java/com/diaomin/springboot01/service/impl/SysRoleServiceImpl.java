package com.diaomin.springboot01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diaomin.springboot01.dao.SysRoleMapper;
import com.diaomin.springboot01.pojo.SysRole;
import com.diaomin.springboot01.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统角色 服务实现类
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

}
