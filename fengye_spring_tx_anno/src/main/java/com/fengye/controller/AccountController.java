package com.fengye.controller;

import com.fengye.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = app.getBean(IAccountService.class);
        accountService.transfer("tom","lucy",500);
    }
}
