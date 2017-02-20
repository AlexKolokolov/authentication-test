package org.kolokolov.authdemo.controller;

import javax.faces.bean.ManagedBean;

import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean
public class WelcomeController {
    
    private String name;
    
    public String getHelloMessage() {
        String msg = null;
        if (name != null) {
            msg = String.format("Hello, %s!", name);
        }
        return msg;
    }
    
    public String logout() {
        SecurityContextHolder.clearContext();
        return "welcome";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getStatus() {
        return "Status: OK";
    }
}
