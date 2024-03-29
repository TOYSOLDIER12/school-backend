package com.example.deleteme.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String titre;
    private String desc;
    @OneToOne(mappedBy = "cours")
    private Professeur professeur;
    @OneToMany(mappedBy = "cours", fetch = FetchType.LAZY)
    private Collection<Seance> seances = new ArrayList<>();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cours{");
        sb.append("Id='").append(getId()).append('\'');
        sb.append("Titre='").append(getTitre()).append('\'');
        sb.append(", seances=[");
        for (Seance seance : getSeances()) {
            sb.append(seance.getId()).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
