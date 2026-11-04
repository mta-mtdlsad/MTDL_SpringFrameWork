package com.prapura.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnectionUtil {
    @Value("${url}")
    private String url;

    @Value("${userName}")
    private String userName;

    @Value("${userPassword}")
    private String userPaassword;

    @Override
    public String toString() {
        return  url
                +"\n"+userName
                +"\n"+userPaassword;
    }
}
