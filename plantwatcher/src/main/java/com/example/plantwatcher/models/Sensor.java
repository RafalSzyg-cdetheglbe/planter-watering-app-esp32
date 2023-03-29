package com.example.plantwatcher.models;

import java.time.LocalDateTime;

public class Sensor {
    private int temperature;
    private int moisture;
    private int insolation;
    private LocalDateTime date;

    public Sensor(int temperature, int moisture, int insolation, LocalDateTime date) {
        this.temperature = temperature;
        this.moisture = moisture;
        this.insolation = insolation;
        this.date = date;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMoisture() {
        return moisture;
    }

    public void setMoisture(int moisture) {
        this.moisture = moisture;
    }

    public int getInsolation() {
        return insolation;
    }

    public void setInsolation(int insolation) {
        this.insolation = insolation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
