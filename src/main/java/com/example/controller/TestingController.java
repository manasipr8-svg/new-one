package com.fazon.simplybytespringboot.controller;

import lombok.*;
import org.springframework.web.bind.annotation.annotation.*;

@RestController
@RequestMapping("/api/health")
@AllArgsConstructor
public class TestingController {

    @GetMapping
    public String healthCheck() {
        return "Application is running!";
    }
}