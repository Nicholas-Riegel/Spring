package com.SpringLearning.s07Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // this allows Spring context to create the object
public class Dev {

    // OLD WAY
//    Laptop lap = new Laptop();

    // NEW WAY
//    @Autowired // this is called a field injection
    private Laptop lap;

    // OR using constructor injection

//    public Dev(Laptop lap){
//      this.lap = lap;
//    }

    // OF using setter injection
    @Autowired
    public void setLap(Laptop lap){
        this.lap = lap;
    }

    public void build(){

        lap.compile();
        System.out.println("Hello from the Dev class!");
    }
}
