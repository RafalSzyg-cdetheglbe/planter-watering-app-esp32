package com.example.plantwatcher.dto;

public class ConfigsDTO {
    private String name;
    private int moistureStarter;
    private int insolationStarter;
    private int temperatureStarter;

    public int getMoistureStarter() {
        return moistureStarter;
    }

    public void setMoistureStarter(int moistureStarter) {
        this.moistureStarter = moistureStarter;
    }

    public int getInsolationStarter() {
        return insolationStarter;
    }

    public void setInsolationStarter(int insolationStarter) {
        this.insolationStarter = insolationStarter;
    }

    public int getTemperatureStarter() {
        return temperatureStarter;
    }

    public void setTemperatureStarter(int temperatureStarter) {
        this.temperatureStarter = temperatureStarter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
