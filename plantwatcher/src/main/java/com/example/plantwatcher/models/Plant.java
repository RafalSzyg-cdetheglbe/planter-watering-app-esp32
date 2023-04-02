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

    @Column(name = "image")
    private String imageName;

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

    public Configs getConfig() {
        return config;
    }

    public void setConfig(Configs config) {
        this.config = config;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    // Getters and setters
}
