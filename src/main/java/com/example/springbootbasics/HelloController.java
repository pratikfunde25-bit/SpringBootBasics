package com.example.springbootbasics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "Running");
        response.put("message", "Welcome to Spring Boot MongoDB CRUD API!");
        response.put("endpoints", Map.of(
                "Hello Endpoint", "GET /hello",
                "Get All Products", "GET /api/products",
                "Create Product", "POST /api/products",
                "Get Product by ID", "GET /api/products/{id}",
                "Update Product", "PUT /api/products/{id}",
                "Delete Product", "DELETE /api/products/{id}",
                "Filter by Category", "GET /api/products/category/{category}",
                "Search by Name", "GET /api/products/search?name={name}"
        ));
        return response;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }
}