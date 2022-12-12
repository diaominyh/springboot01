package com.diaomin.springboot01;

import com.diaomin.springboot01.dao.SysUserMapper;
import com.diaomin.springboot01.pojo.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.time.Duration;
import java.util.List;

@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testValueSet(){

        /*//获取操作特定数据类型的operations对象
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        //通过operations对象操作数据
        valueOperations.set("name","zhangsan");
        valueOperations.set("age",18, Duration.ofSeconds(60));*/
    }
    /*@Test
    void contextLoads() {
        SysUser sysUserList=sysUserMapper.selectByAccount(null);
        System.out.println(sysUserList);
    }*/


}
