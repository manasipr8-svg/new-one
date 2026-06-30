package com.fazon.simplybytespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class TestingController {

    @GetMapping
    public String healthCheck() {
        return "Application is running!";
    }
}
