package com.fengye.factory;

import com.fengye.dao.IUserDao;
import com.fengye.dao.impl.UserDaoImpl;

/**
 * 创建静态化实例方法返回bean
 */
public class StaticBeanFactory {
    public static IUserDao getBean(){
        return new UserDaoImpl();
    }
}
