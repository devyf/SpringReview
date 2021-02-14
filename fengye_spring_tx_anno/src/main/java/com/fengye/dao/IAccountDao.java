package com.fengye.dao;

public interface IAccountDao {
    void out(String outMan, double money);

    void in(String inMan, double money);
}
