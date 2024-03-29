package com.example.deleteme.dao.repositories;

import com.example.deleteme.dao.entities.Etudiant;
import com.example.deleteme.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}

