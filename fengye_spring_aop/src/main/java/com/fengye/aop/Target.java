package com.fengye.aop;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running...");
    }
}
