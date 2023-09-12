package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Train {
    @GetMapping("/train")
    public String getData(){
        return "Book train on make my trip";
    }
}
