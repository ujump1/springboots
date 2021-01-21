package com.yj.springboots;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController  {

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return "hello:"+name+"I am port 8080" ;
    }
}