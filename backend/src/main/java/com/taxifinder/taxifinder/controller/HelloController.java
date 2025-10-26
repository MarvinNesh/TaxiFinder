package com.taxifinder.taxifinder.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxifinder.taxifinder.model.Location;
import com.taxifinder.taxifinder.repository.LocationRepository;

@RestController
public class HelloController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/api/locations")
    public void receiveLocation(@RequestBody Map<String, String> payload) {
        String from = payload.get("from");
        String to = payload.get("to");


        
        System.out.println("Received a request to find a taxi from: " + from + " to: " + to);

    
        // For now,save a dummy location to test the database.
        Location location = new Location();
        location.setLatitude(0.0);
        location.setLongitude(0.0);
        location.setTimestamp(LocalDateTime.now());
        locationRepository.save(location);
    }
}