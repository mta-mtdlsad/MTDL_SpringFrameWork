package com.prapura.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
   public String name;
   public HelloMessage helloMessage;

    public Greeter(String name, HelloMessage helloMessage) {
        this.name = name;
        this.helloMessage = helloMessage;
    }

    public String greeting(){
        return helloMessage.getMessage()+name+", How are you?";
    }
}
