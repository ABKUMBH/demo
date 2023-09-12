package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {
    @GetMapping("/flight")
    public String getData(){
        return "Book Indigo flight on make my trip";
    }
}
