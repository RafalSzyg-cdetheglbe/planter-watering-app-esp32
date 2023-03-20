package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Configs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigsRepository extends JpaRepository<Configs, Long> {
}
