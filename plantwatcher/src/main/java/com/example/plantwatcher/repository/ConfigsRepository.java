package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Configs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface ConfigsRepository extends JpaRepository<Configs, Long> {
}
