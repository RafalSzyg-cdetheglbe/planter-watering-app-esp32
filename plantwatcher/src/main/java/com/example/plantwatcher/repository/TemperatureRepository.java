package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.models.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureRepository  extends JpaRepository<Temperature, Long> {
    Temperature findFirstByOrderByDateDesc();
    List<Temperature> findAllByOrderByDateAsc();


}
