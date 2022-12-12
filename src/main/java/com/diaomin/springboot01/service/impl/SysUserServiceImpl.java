package com.diaomin.springboot01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diaomin.springboot01.dao.SysUserMapper;
import com.diaomin.springboot01.pojo.SysUser;
import com.diaomin.springboot01.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
