package com.example.spring2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private int count = 0;

    @RequestMapping("/count")
    public String count(){
        count++;
        return "Count: " + count;
    }

    @RequestMapping("/at")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/")
    public String Welcome(){
        return "Welcome!";
    }
}
