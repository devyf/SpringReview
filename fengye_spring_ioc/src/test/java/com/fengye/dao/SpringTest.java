package com.fengye.dao;

import com.fengye.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    //测试scope属性：prototype和singleton
    public void scopeTest(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao1 = (UserDaoImpl)app.getBean("userDao");
        System.out.println(userDao1);
        UserDaoImpl userDao2 = (UserDaoImpl)app.getBean("userDao");
        System.out.println(userDao2);
    }

    @Test
    public void staticFactoryTest(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl) app.getBean("staticBeanFactory");
        userDao.save();
    }

    @Test
    public void dynamicFactoryTest(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl userDao = (UserDaoImpl) app.getBean("dynamic");
        userDao.save();
    }
}
