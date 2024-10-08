package com.example.demoServiceCertification.controllers;

import com.example.demoServiceCertification.models.Service;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/service")
public class ServiceController {
    private List<Service> services = new ArrayList<>();

    @PostMapping
    public Service createService(@RequestBody  @Valid Service service) {
        service.setId(services.size() + 1);
        services.add(service);
        return service;
    }

    @GetMapping
    public List<Service> getAllServices() {
        return services;
    }

    @GetMapping("/{id}")
    public Service getService(@PathVariable int id) {
        return services.stream()
                .filter(service -> Objects.equals(service.getId(), id))
                .findFirst()
                .orElseThrow();
    }

    @PutMapping("/{id}")
    public Service updateService(@PathVariable int id, @RequestBody Service service) {
        Service existingService = getService(id);
        existingService.setName(service.getName());
        existingService.setDescription(service.getDescription());
        existingService.setDocumentationLink(service.getDocumentationLink());
        existingService.setSwaggerLink(service.getSwaggerLink());
        return existingService;
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable int id) {
        services.removeIf(service -> Objects.equals(service.getId(), id));
    }
}
