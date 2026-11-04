package com.prapura;

import com.prapura.utils.Greeter;
import com.prapura.utils.HelloMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prapura")
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(MainApplication.class);
        System.out.println("\nSpring Bean Factory Started, " +
                "customers can ask what they need");

        Greeter greeter = context.getBean(Greeter.class);
        System.out.println(greeter.greeting());
    }
}
