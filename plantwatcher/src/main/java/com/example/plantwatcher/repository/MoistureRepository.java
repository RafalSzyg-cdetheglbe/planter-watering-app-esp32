package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoistureRepository  extends JpaRepository<Moisture, Long> {

}
