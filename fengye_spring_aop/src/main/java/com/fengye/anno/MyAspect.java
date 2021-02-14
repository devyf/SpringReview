package com.fengye.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect  //标注当前MyAspect是一个切面类
public class MyAspect {

    @Before("execution(* com.fengye.anno.*.*(..))")
    public void before(){
        System.out.println("前置代码增强....");
    }

    @AfterReturning("execution(* com.fengye.anno.*.*(..))")
    public void afterReturning(){
        System.out.println("后置代码增强....");
    }

    @Around("execution(* com.fengye.anno.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        //切点方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强...");
        return proceed;
    }

    @AfterThrowing("execution(* com.fengye.anno.*.*(..))")
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    @After("commonMethod()")
    //@After("MyAspect.commonMethod()")
    public void after(){
        System.out.println("最终增强...");
    }

    @Pointcut("execution(* com.fengye.anno.*.*(..))")
    //公共方法作为注解 @Pointcut提取公共切面参数
    public void commonMethod(){

    }
}
