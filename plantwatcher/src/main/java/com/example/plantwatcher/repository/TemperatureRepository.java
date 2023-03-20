package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository  extends JpaRepository<Temperature, Long> {
}
