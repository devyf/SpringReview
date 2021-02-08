package com.fengye.service.impl;

import com.fengye.dao.IUserDao;
import com.fengye.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Value("${jdbc.driverClassName}")
    private String driver;

//    @Autowired
//    private IUserDao userDao;

    public void save() {
        System.out.println(driver);
       // userDao.save();
    }
}
