package com.example.deleteme.dao.repositories;

import com.example.deleteme.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}

