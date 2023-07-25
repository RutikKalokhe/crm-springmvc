
package com.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

/**
 * Created by Amit Pisal
 */
@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.demo.controller.*.*(..))")
    private void forControllerPackage() {}

    @Pointcut("execution(* com.demo.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.demo.dao.*.*(..))")
    private void forDAOPackage() {}

    @Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
    private void forAppFlow() {}

    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        logger.info("=======>> in @Before: calling method: " + joinPoint.getSignature().toShortString());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args)
            logger.info("=======>> argument: " + arg);
    }

    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("=======>> in @Before: calling method: " + joinPoint.getSignature().toShortString());
        logger.info("=======>> result: " + result);
    }
}
