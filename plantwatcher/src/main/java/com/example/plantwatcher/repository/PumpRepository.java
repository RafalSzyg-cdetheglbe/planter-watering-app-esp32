package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Pump;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepository extends JpaRepository<Pump,Long> {
}
