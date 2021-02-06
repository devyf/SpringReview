package com.fengye.factory;

import com.fengye.dao.IUserDao;
import com.fengye.dao.impl.UserDaoImpl;

public class DynamicBeanFactory {
    public IUserDao getBean1(){
        return new UserDaoImpl();
    }
}
