package com.mycustom.springbootcustomstartertest.controller;

import com.mycustom.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/mycustom/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.sayHelloMyCustom(name);
    }
}
