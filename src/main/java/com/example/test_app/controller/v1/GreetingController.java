package com.example.test_app.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/register")
    public String greeting() {
        return "<h1>test</h1";
    }

}
