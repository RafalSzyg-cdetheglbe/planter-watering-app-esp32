package com.example.plantwatcher.repository;

import com.example.plantwatcher.models.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmailRepository extends JpaRepository<Email,Long> {

}
