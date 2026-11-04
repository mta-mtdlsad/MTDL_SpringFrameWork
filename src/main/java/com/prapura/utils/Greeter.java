package com.prapura.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private String name;
    @Autowired                              //field injection :: Not Preferred
    private HelloMessage helloMessage;

//    public Greeter(HelloMessage helloMessage) {   // constructor injection :: Most preferred
//        System.out.println("Creating object of Greeter");
//        this.helloMessage = helloMessage;
//    }

//    @Autowired                            //setter injection :: Less Preferred
//    public void setHelloMessage(HelloMessage helloMessage) {
//        this.helloMessage = helloMessage;
//    }

    /*
        Most Preferred :: Constructor Injection

    */

    public String greeting(){
        return helloMessage.getMessage()+"How are you?";
    }
}
