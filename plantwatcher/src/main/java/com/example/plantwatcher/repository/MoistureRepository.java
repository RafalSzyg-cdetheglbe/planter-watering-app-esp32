package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoistureRepository  extends JpaRepository<Moisture, Long> {
}
