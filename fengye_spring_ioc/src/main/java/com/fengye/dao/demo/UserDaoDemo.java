package com.fengye.dao.demo;

import com.fengye.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据applicationContext.xml中配置的id名称进行获取
        UserDaoImpl userDao = (UserDaoImpl)app.getBean("userDao");
        System.out.println(userDao);
        userDao.save();
    }
}
