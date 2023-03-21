package com.example.plantwatcher.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "config_id")
    private Configs config;

    @Lob
    @Column(name = "image")
    private byte[] image;
    // Getters and setters
}
