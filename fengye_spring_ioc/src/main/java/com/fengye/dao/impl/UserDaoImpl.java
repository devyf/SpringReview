package com.fengye.dao.impl;

import com.fengye.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
//    private String userName;
//
//    public UserDao(String name){
//        this.userName = name;
//    }

    public void save() {
        System.out.println("这是save方法！");
    }
}
