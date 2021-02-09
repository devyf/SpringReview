package com.fengye.dao;

import com.fengye.config.SpringConfiguration;
import com.fengye.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigTest {
    @Test
    public void configurationTest(){
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserServiceImpl service = app.getBean(UserServiceImpl.class);
        service.save();
    }
}
