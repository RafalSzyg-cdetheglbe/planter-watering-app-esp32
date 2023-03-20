package com.example.plantwatcher.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Temperature")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "value", nullable = false)
    private int value;

    @Column(name = "date", nullable = false)
    private Date date;

    @Lob
    @Column(name = "image")
    private byte[] image;
    // Getters and setters
}
