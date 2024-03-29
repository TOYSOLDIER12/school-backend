package com.example.deleteme.dao.entities;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

    @Entity
    @Setter
    @Getter

    @AllArgsConstructor
    @NoArgsConstructor
    public class Seance {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  int id;
        private Date date;
        @ManyToMany(fetch = FetchType.EAGER)
        private Collection<Etudiant> etudiants = new ArrayList<>();
        @ManyToOne
        private Cours cours;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Seance{");
            sb.append("id=").append(id);
            sb.append(", date=").append(date);
            sb.append(", etudiants=[");
            for (Etudiant etudiant : etudiants) {
                sb.append(etudiant.getName()).append(", "); // ya rebi tkhdm hhh
            }
            sb.append("], cours=").append(cours.getTitre());
            sb.append('}');
            return sb.toString();
        }
    }
