package com.taxifinder.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the TaxiFinder Backend!";
    }
    @GetMapping("/")
    public String index() {
        return "marvin testing end point";
    }
}