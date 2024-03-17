package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(void demo.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp) {
        System.out.println(jp.getArgs()[0].toString());
        System.out.println("Before Logging");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logging");
    }
}
