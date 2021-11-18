package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello from Azure App Service (in the staging slot)!";
    }
     @GetMapping("/monitor")
    public String monitor() throws Exception {
        String test = null;
        test.toString();
        return "";
    }
}
