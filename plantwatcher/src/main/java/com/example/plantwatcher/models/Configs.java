package com.example.plantwatcher.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Configs")
public class Configs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "moisture_starter")
    private Integer moistureStarter;

    @Column(name = "temperature_starter")
    private int temperatureStarter;

    @Column(name = "insolation_starter")
    private int insolationStarter;

    public Configs() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoistureStarter() {
        return moistureStarter;
    }

    public void setMoistureStarter(Integer moistureStarter) {
        this.moistureStarter = moistureStarter;
    }

    public int getTemperatureStarter() {
        return temperatureStarter;
    }

    public void setTemperatureStarter(int temperatureStarter) {
        this.temperatureStarter = temperatureStarter;
    }

    public int getInsolationStarter() {
        return insolationStarter;
    }

    public void setInsolationStarter(int insolationStarter) {
        this.insolationStarter = insolationStarter;
    }

    // Getters and setters
}

