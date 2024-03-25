package com.melcam.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome";
    }

    @GetMapping("/hello-secured")
    public String helloSecured() {
        return "Welcome secured";
    }
}
