package com.example3.demo3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{
    @RequestMapping("/")
    public String greet(){
        return "Hello World Telusco!";
    }
}
