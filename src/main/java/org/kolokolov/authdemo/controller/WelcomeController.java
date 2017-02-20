package org.kolokolov.authdemo.controller;

import javax.faces.bean.ManagedBean;

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
