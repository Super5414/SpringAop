package com.example.SpringAop.Logging;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
    @Around("execution(public void springbootaoptut.service.UserService.logIn())")
    public void loggingAdvice3() {
        System.out.println("Before and After invoking method logIn");
    }

    @AfterThrowing("execution(public void springbootaoptut.service.UserService.logOut())")
    public void loggingAdvice4() {
        System.out.println("Exception thrown in logOut method");
    }

    @AfterReturning("execution(public void springbootaoptut.service.UserService.logOut())")
    public void loggingAdvice5() {
        System.out.println("AfterReturning advice for logOut is run");
    }

    @Pointcut("execution(public * springbootaoptut.service.UserService.*(..))")
    public void pointCut() {
    }

    @Pointcut("execution(public * springbootaoptut.service.UserService.*(..))")
    public void pointCut1() {
    }

    @Before("pointCut() || pointCut1()")
    public void loggingAdvice6() {
        System.out.println("Before advice using pointcut is executed");
    }
}