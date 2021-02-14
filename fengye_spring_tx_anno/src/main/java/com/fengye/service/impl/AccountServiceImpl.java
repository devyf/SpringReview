package com.fengye.service.impl;


import com.fengye.dao.IAccountDao;
import com.fengye.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accounrService")
//也可以加在类上面，表示当前类中的所有方法都配置这个事务隔离级别
//@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
