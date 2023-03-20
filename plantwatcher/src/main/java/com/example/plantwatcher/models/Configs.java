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

    // Getters and setters
}

