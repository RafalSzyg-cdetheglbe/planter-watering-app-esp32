package com.example.plantwatcher.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Configruration")
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "config_id")
    private Configs config;

    public Configs getConfig() {
        return config;
    }

    public void setConfig(Configs config) {
        this.config = config;
    }

    // Getters and setters
}