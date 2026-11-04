package com.prapura.utils;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
   public Message message;

    //public Greeter(@Qualifier("heyMessage") Message message) {
    public Greeter(Message message) {
        this.message = message;
    }

    public String greeting(){
        return message.getMessage()+" How are you?";
    }
}
