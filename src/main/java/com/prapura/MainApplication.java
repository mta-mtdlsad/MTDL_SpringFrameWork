package com.prapura;

import com.prapura.utils.Greeter;
import com.prapura.utils.HelloMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prapura")
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext factory
                = new AnnotationConfigApplicationContext(MainApplication.class);
        System.out.println("Factory is ready to use\n");

        System.out.println("Customer asking for Greeter class");

        Greeter greeter = factory.getBean(Greeter.class);
        System.out.println("Address of First Object "+greeter);
        System.out.println(greeter.greeting());

        greeter = factory.getBean(Greeter.class);
        System.out.println("Address of Second Object "+greeter);
        System.out.println(greeter.greeting());

        greeter = factory.getBean(Greeter.class);
        System.out.println("Address of Third Object "+greeter);
        System.out.println(greeter.greeting());
    }
}
