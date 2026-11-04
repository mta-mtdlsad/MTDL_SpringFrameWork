package com.prapura.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
   public Message message;

    //public Greeter(@Qualifier("heyMessage") Message message) {
    public Greeter(Message message) {
        System.out.println("\nCreating Object of Greeter");
        this.message = message;
    }

    public String greeting(){
        return message.getMessage()+" How are you?";
    }
}
