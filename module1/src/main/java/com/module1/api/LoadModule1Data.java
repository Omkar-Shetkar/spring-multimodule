package com.module1.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadModule1Data implements CommandLineRunner {

    private WeatherRepository repository;

    public LoadModule1Data(WeatherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Weather(1, "Bangalore", 20));
        repository.save(new Weather(2, "Mumbai", 25));
        repository.save(new Weather(3, "New Delhi", 26));
    }
}
