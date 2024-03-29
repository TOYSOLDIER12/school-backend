package com.example.deleteme.dao.repositories;

import com.example.deleteme.dao.entities.Personne;
import com.example.deleteme.dao.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}

