package com.dependencyInjection06.demoDI06;

import org.springframework.stereotype.Component;

@Component // this allows Spring context to create the object
public class Dev {
    public void build(){
        System.out.println("Working on some project");
    }
}
