package com.example.deleteme.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Professeur extends Personne{
    private String d_affectation;
    @OneToOne
    private Cours cours;

    @Override
    public String toString() {
        return "Professeur{" +
                "nom name='" + getName() + '\'' + " ,"+
                "d_affectation='" + getD_affectation() + '\'' +
                ", cours=" + getCours().getTitre() +
                '}';
    }
}
