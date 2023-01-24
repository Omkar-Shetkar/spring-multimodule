package com.module1.api;

import javax.persistence.*;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String city;

    @Column
    private double temperature;

    public Weather() {
    }

    public Weather(Integer id, String city, double temperature) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
    }

    public Integer getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
