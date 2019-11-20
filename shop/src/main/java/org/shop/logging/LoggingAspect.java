package org.shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* *(..))")
    private void allMethods() {
    }

    @After("allMethods() && within(org.shop.api.impl.*)")
    public void logImplBefore(JoinPoint joinPoint) {
        logger.info("Impl_Finish: {}", joinPoint);
    }

    @After("allMethods() && within(org.shop.repository.map.*) ")
    public void logRepoBefore(JoinPoint joinPoint) {
        logger.info("Repo_Finish: {}", joinPoint);
    }

}
