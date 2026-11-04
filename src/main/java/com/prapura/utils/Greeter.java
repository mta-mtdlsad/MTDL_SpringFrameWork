package com.prapura.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private String name;
    private HelloMessage helloMessage;

    public Greeter() {
        System.out.println("Creating object of Greeter");
    }

    @Autowired
    public Greeter(HelloMessage helloMessage) {
        System.out.println("Creating Greeter Object - HelloMessage");
        this.helloMessage = helloMessage;
    }

    public Greeter(String name, HelloMessage helloMessage) {
        System.out.println("Creating Greeter Object - name, HelloMessage");
        this.name = name;
        this.helloMessage = helloMessage;
    }

    public String greeting(){
        return helloMessage.getMessage()+"How are you?";
    }
}
