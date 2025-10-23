package com.taxifinder.backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserName {
    @GetMapping("/username")
    public String username() {
        return "vhuhwavho";
    }
    @GetMapping("/user")
    public String user() {
        return "vhuhwavho";
    }
}
