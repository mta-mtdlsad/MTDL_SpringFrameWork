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
        /*
            starts the Spring Bean Factory
            Does a component scan in the package mentioned in cofiguration file
            Identify the components, prepare the beans and keep it ready
         */
        ApplicationContext factory
                = new AnnotationConfigApplicationContext(MainApplication.class);

        System.out.println("\nSpring Bean Factory Started, " +
                "customers can ask what they need\n");

        System.out.println("=========== READING APPLICATION CONTEXT ============");

        String[] listOfBeanNames = factory.getBeanDefinitionNames();
        for(String beanName : listOfBeanNames)
            System.out.println(beanName);

        System.out.println();

        //fetching bean by mentioning the bean name
        Greeter greeter2 = (Greeter) factory.getBean("greeter");
        System.out.println("Number of Beans Created :: "+factory.getBeanDefinitionCount());

        Greeter greeter = factory.getBean(Greeter.class);
        System.out.println(greeter.greeting());
    }
}
