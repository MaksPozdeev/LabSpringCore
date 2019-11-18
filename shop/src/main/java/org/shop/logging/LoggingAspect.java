package org.shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* *.logEvent(..))")
    private void allLogEventMethods(){}

    @Before("allLogEventMethods()")
    public void logBefore(JoinPoint joinPoint){



    }
}
