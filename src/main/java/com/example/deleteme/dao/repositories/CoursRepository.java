package com.example.deleteme.dao.repositories;

import com.example.deleteme.dao.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}

