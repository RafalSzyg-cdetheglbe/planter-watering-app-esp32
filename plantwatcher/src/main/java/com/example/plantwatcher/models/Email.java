package com.example.plantwatcher.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "temperaturenotificationdate", nullable = true)
    private LocalDateTime temperatureNotificationDate;

    @Column(name = "insolationnotificationdate", nullable = true)
    private LocalDateTime insolationNotificationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getTemperatureNotificationDate() {
        return temperatureNotificationDate;
    }

    public void setTemperatureNotificationDate(LocalDateTime temperatureNotificationDate) {
        this.temperatureNotificationDate = temperatureNotificationDate;
    }

    public LocalDateTime getInsolationNotificationDate() {
        return insolationNotificationDate;
    }

    public void setInsolationNotificationDate(LocalDateTime insolationNotificationDate) {
        this.insolationNotificationDate = insolationNotificationDate;
    }
}
