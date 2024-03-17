package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticateAspect {

    @Pointcut("within(demo..*)")
    public void authenticatePointcut(){

    }

    @Pointcut("within(demo.ShoppingCart.*)")
    public void authorizationPointcut(){

    }
   @Before("authenticatePointcut() || authorizationPointcut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }
    @Before("authenticatePointcut() || authorizationPointcut()")
    public void authorization(){
        System.out.println("Authorization the Request");
    }

}
