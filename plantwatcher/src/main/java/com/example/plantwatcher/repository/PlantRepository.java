package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository  extends JpaRepository<Plant, Long> {
}
