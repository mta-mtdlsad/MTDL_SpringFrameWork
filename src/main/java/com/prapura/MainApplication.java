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
    @Bean
    public HelloMessage getHelloMessage() {
        return new HelloMessage();
    }

    @Bean
    public String getName() {
        return new String("Prapura");
    }


    public static void main(String[] args) {
        ApplicationContext factory
                = new AnnotationConfigApplicationContext(MainApplication.class);

        Greeter greeter = factory.getBean(Greeter.class);
        System.out.println(greeter.greeting());
    }
}
