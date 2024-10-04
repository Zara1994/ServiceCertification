package com.example.demoServiceSertification.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @GetMapping("/{serviceId}")
    public String getService(String serviceId)
    {
        return "Service fousdsnd";
    }
}
