package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "demo")
public class Beanconfig {
    /*@Bean
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }*/
}

