package com.prapura.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("heyMessage")
public class HeyMessage implements Message{
    @Override
    public String getMessage() {
        return "Hey, ";
    }
}
