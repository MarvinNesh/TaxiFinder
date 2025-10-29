package com.taxifinder.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/api/locations")
    public void receiveLocation(@RequestBody Map<String, String> payload) {
        String from = payload.get("from");
        String to = payload.get("to");

        System.out.println("Received a request to find a taxi from: " + from + " to: " + to);
    }
}