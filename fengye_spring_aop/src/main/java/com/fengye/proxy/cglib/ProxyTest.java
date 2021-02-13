package com.fengye.proxy.cglib;

import com.fengye.proxy.jdk.Advice;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {
    public static void main(String[] args) {
        //目标对象
        final Target target = new Target();
        //增强对象
        final Advice advice = new Advice();

        //1.创建增强器
        Enhancer enhancer = new Enhancer();
        //2.设置父类（目标）
        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                //前置增强方法
                advice.before();
                Object invoke = method.invoke(target, args);
                //后置增强方法
                advice.afterReturning();
                return invoke;
            }
        });
        //4.创建代理对象
          Target proxy = (Target)enhancer.create();
          //5.调用测试目标方法
          proxy.save();
    }
}
