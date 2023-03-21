package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoistureRepository  extends JpaRepository<Moisture, Long> {
    Moisture findFirstByOrderByDateDesc();
    List<Moisture> findAllByOrderByDateAsc();

}
