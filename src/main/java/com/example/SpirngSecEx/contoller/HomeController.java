package com.example.SpirngSecEx.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String HomeController() {
        System.out.println("HomeController");
        return "Hello Niko";
    }
}
