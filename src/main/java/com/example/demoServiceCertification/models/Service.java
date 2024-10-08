package com.example.demoServiceCertification.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Service {
    @Valid
    @NotNull(message = "name is not null")
    @NotBlank(message = "not null")
    private String name;
    private String description;
    private String documentationLink;
    private String swaggerLink;

    private int id;

    public Service(String name, String description,int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDocumentationLink() {
        return documentationLink;
    }
    public void setDocumentationLink(String swaggerLink) {
        this.documentationLink = documentationLink;
    }
    public String getSwaggerLink() {
        return swaggerLink;
    }
    public void setSwaggerLink(String swaggerLink) {
        this.swaggerLink = swaggerLink;
    }
}
