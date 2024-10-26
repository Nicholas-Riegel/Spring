package com.SpringLearning.s07Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile(){
        System.out.println("Compiling. From the Laptop class.");
    }
}
