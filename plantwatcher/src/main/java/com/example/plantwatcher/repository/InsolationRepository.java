package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsolationRepository extends JpaRepository<Insolation, Long> {
    Insolation findFirstByOrderByDateDesc();
    List<Insolation>findAllByOrderByDateAsc();
}
