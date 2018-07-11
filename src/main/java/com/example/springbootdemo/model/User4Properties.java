package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="login")
public class User4Properties {
    private String userName;
    private String password;

    public void show() {
        System.out.println("对象装配 login.userName=" + this.userName);
        System.out.println("对象装配 login.password=" +this.password);
    }
}
