package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/app")
public class AppController {

    private final CustomerRepository repository;

    public AppController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<String> getAppMessage() {
        return repository.findAll().stream()
                .map(c -> String.format("Id: %d Customer: %s", c.getId(), c.getName()))
                .collect(Collectors.toList());
    }

}
