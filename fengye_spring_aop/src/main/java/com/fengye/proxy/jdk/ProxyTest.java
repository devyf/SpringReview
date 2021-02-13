package com.fengye.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //目标对象
        final Target target = new Target();
        //增强对象
        final Advice advice = new Advice();
        TargetInterface proxy = (TargetInterface)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),  //目标对象类加载器
                target.getClass().getInterfaces(),  //目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    //调用代理对象执行invoke反射回调目标方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强方法
                        advice.before();
                        Object invoke = method.invoke(target, args);
                        //后置增强方法
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );
        //调用代理对象的方法
        proxy.save();
    }
}
