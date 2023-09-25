package edu.jsp.bean;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;

    public Engine() {
        this.type = "Default Engine";
    }

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}