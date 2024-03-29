package com.example.deleteme.dao.repositories;

import com.example.deleteme.dao.entities.Personne;
import com.example.deleteme.dao.entities.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
}

