package com.SpringLearning.s06DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile(){
        System.out.println("Compiling. From the Laptop class.");
    }
}
