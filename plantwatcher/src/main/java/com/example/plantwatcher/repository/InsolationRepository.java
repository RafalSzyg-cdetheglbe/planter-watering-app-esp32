package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.models.Insolation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsolationRepository extends JpaRepository<Insolation, Long> {
}
