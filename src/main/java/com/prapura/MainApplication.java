package com.prapura;

import com.prapura.utils.DbConnectionUtil;
import com.prapura.utils.Greeter;
import com.prapura.utils.HelloMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.prapura")
@PropertySource("classpath:application.properties")
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext factory
                = new AnnotationConfigApplicationContext(MainApplication.class);
        System.out.println("Factory is ready to use\n");

       System.out.println(factory.getBean(DbConnectionUtil.class));
    }
}
