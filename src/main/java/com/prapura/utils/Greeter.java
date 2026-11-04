package com.prapura.utils;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private HelloMessage helloMessage;

    public Greeter(HelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String greeting(){
        return helloMessage.getMessage()+"How are you?";
    }
}
