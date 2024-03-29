package com.example.deleteme.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.hibernate.annotations.Collate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
public class Etudiant extends Personne {
    private String matricule;
    @ManyToMany(mappedBy = "etudiants", fetch = FetchType.EAGER)
    private Collection<Seance> seances = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Etudiant{");
        sb.append("matricule='").append(getMatricule()).append('\'');
        sb.append("name='").append(getName()).append('\'');
        sb.append(", seances=[");
        for (Seance seance : getSeances()) {
            sb.append(seance.getId()).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
