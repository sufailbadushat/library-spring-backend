package com.nest.library_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Home Page!";
    }
}
