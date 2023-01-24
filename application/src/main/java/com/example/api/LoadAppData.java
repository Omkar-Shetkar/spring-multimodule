package com.example.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadAppData implements CommandLineRunner {

    private UserRepository repository;

    public LoadAppData(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Customer(1, "Bheem"));
        repository.save(new Customer(2, "Humpty Dumpty"));
        repository.save(new Customer(3, "Alice"));
    }
}
