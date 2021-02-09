package com.fengye.test;

import com.fengye.config.SpringConfiguration;
import com.fengye.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//使用@Runwith注解替换原来的运行时
@RunWith(SpringJUnit4ClassRunner.class)
//使用@ContextConfiguration指定配置文件或配置类
//@ContextConfiguration(value = {"classpath:applicationContext.xml"}) //配置文件路径方式，value一般省略
@ContextConfiguration(classes = {SpringConfiguration.class}) //全注解方式
public class SpringJunitTest {
    @Autowired //使用@Autowired注入需要测试的对象
    private IUserService userService;
    @Test
    public void userServiceTest(){
        userService.save();
    }
}
