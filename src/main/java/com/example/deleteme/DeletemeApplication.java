package com.example.deleteme;
import com.example.deleteme.dao.entities.*;
import com.example.deleteme.dao.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Transactional
@SpringBootApplication
public class DeletemeApplication implements CommandLineRunner {
	@Autowired
	PersonneRepository personneRepository;
	@Autowired
	CoursRepository coursRepository;
	@Autowired
	SeanceRepository seanceRepository;

	public static void main(String[] args) {
		SpringApplication.run(DeletemeApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {
			Personne personne = new Personne(1, "javeel");
			personneRepository.save(personne);

			Cours arabe = new Cours();
			arabe.setDesc("ghir arabe");
			arabe.setTitre("arabia ya l3abd");
			Professeur professeur = new Professeur();
			professeur.setD_affectation("prof nadi");
			professeur.setName("prof dahmad");
			personneRepository.save(professeur);
			coursRepository.save(arabe);
			arabe.setProfesseur(professeur);
			professeur.setCours(arabe);
			personneRepository.save(professeur);
			coursRepository.save(arabe);
			Seance arabe1 = new Seance();
			Seance arabe2 = new Seance();
			Etudiant etudiant1 = new Etudiant();
			Etudiant etudiant2 = new Etudiant();
			arabe1.setCours(arabe);
			arabe1.setDate(new Date(2001,12,2));
			arabe2.setCours(arabe);
			arabe2.setDate(new Date(2002,12,2));
			Collection<Seance> seances = new ArrayList<>();
			seances.add(arabe1);
			seances.add(arabe2);
			seanceRepository.saveAll(seances);
			Collection<Etudiant> etudiants = new ArrayList<>();
			etudiant1.setSeances(seances);
			etudiant1.setName("ilyas");
			etudiant1.setMatricule("mat ricule");
			etudiant2.setName("driss");
			etudiant2.setMatricule("ma match ricule");
			etudiant2.setSeances(seances);
			etudiants.add(etudiant1);
			etudiants.add(etudiant2);
			personneRepository.saveAll(etudiants);
			arabe1.setEtudiants(etudiants);
			arabe2.setEtudiants(etudiants);
			seanceRepository.saveAll(seances);
			arabe.setSeances(seances);
			coursRepository.save(arabe);
			System.out.println(personneRepository.findAll()+"\n");
			System.out.println(seanceRepository.findAll()+"\n");
			System.out.println(coursRepository.findAll()+"\n");


			personneRepository.findById((long)1).get().setName("machi javeel");
			personneRepository.save(personneRepository.findById((long)1).get());
			//personneRepository.deleteById((long)1);

 }
}
