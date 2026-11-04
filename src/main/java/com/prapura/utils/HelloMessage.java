package com.prapura.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HelloMessage implements Message{
    public String getMessage() {
        return "Hello, ";
    }
}
