package com.module1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherRepository repository;

    public WeatherController(WeatherRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<String> getWeather() {
        return repository.findAll().stream()
                .map(w -> String.format("City: %s Temperature: %.2f C", w.getCity(), w.getTemperature()))
                .collect(Collectors.toList());
    }
}
