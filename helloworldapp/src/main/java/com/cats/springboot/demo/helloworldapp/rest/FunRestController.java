package com.cats.springboot.demo.helloworldapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/cats")
    public String getCatMessage() {
        return "Cats Love Me";
    }

    @GetMapping("/fortune")
    public String getTodaysFortune() {
        return "Cats says today is the day";
    }
}
