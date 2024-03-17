package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
   //logging
   //Authentication & Authorization
   public void checkout(String status) {
    System.out.println("checkout method is called from ShoppingCart");
    }
}
