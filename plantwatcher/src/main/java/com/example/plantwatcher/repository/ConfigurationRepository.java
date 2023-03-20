package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.models.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}
