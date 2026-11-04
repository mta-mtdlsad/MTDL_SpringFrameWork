package com.prapura.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Lazy                   //by default all prototypes are lazy loading
public class Greeter {
   public HelloMessage helloMessage;

    public Greeter(HelloMessage helloMessage) {
        System.out.println("Creating Object of Greeter");
        this.helloMessage = helloMessage;
    }

    public String greeting(){
        return helloMessage.getMessage()+" How are you?";
    }
}

/*
    Bean Scopes ::
        Singleton (by default)  :: one bean for entire application
        Prototype               :: new bean at every calling statement

    Bean Scope in case of Web Applications:
        request                 :: new bean for every customer request

        session                 :: new bean for every web session
                                :: there can be multiple requests in one session

        application             :: new bean for each startup to shutdown duration of web-app
                                :: usually applicable for portal applications
*/
