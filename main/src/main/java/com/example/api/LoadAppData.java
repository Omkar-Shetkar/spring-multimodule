package com.example.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadAppData implements CommandLineRunner {

    private CustomerRepository repository;

    public LoadAppData(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Customer(1, "Bheem", "India"));
        repository.save(new Customer(2, "Humpty Dumpty", "USA"));
        repository.save(new Customer(3, "Alice", "UK"));
    }
}
