package com.prapura.utils;

import org.springframework.stereotype.Component;

public class HelloMessage {
    public HelloMessage() {
        System.out.println("Creating object of Hello Message");
    }

    public String getMessage() {
        return "Hello, ";
    }
}
