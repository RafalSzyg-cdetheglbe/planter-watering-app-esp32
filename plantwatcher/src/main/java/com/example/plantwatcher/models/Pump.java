package com.example.plantwatcher.models;

import jakarta.persistence.*;

@Entity
@Table(name="Pump")
public class Pump {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", nullable = false)
    private Boolean state;

    @Column(name = "wasChecked", nullable = false)
    private Boolean wasChecked;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getWasChecked() {
        return wasChecked;
    }

    public void setWasChecked(Boolean wasChecked) {
        this.wasChecked = wasChecked;
    }
}
