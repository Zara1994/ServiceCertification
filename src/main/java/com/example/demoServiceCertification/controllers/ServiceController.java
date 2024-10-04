package com.example.demoServiceCertification.controllers;

import com.example.demoServiceCertification.models.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/service")
public class ServiceController {
    private Map<String, Service> services = new HashMap<>();

    public ServiceController() {
        services.put("1", new Service( "Service One", "Description for Service One", "1"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Service> getService(@PathVariable String id) {
        Service service = services.get(id);
        if (service != null) {
            return ResponseEntity.ok(service);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
