package com.example.Membre_service;

import java.util.Date;
import java.util.List;

import com.example.Membre_service.Bean.PublicationBean;
import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;
import com.example.Membre_service.proxies.PublicationProxyService;
import com.example.Membre_service.repository.EnseignantChercheurRepository;
import com.example.Membre_service.repository.MembreRepository;
import com.example.Membre_service.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.AllArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@AllArgsConstructor
@EnableFeignClients
public class MembreServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MembreServiceApplication.class, args);
	}

	MembreRepository membreRepository;
	EnseignantChercheurRepository echRepository;
	IMemberService membreService ;
	PublicationProxyService publicationProxyService ;
	@Override
	public void run(String... args) throws Exception {


		Etudiant etd1 = Etudiant.builder()
				.cin("123456")
				.nom("hsouna")
				.prenom("hsouna")
				.dateNaissance(new Date())
				.dateInscription(new Date())
				.diplome("mastère")
				.sujet("AI")
				.encadrant(null)
				.build();
		membreRepository.save(etd1);
		Etudiant etd2=Etudiant.builder()
				.cin("123457")
				.nom("hsouna")
				.prenom("hsouna")
				.dateInscription(new Date())
				.dateNaissance(new Date())

				.diplome("ingenieur")

				.encadrant(null)


				.sujet("devops")
				.build();
		membreRepository.save(etd2);
		EnseignantChercheur Ech1=EnseignantChercheur.builder()
				.cin("123458")
				.grad("Professor")
				.dateNaissance(new Date())
				.etablissement("ENIS")
				.email("ech@gmail.com")
				.password("pass3")
				.cv("cv3")
				.nom("hsouna")
				.prenom("hsouna")
				.build();
		membreRepository.save(Ech1);
		EnseignantChercheur Ech2=EnseignantChercheur.builder()
				.cin("123459")
				.grad("Professor")
				.dateNaissance(new Date())
				.etablissement("ENIS")
				.email("ech2@gmail.com")
				.password("pass4")
				.cv("cv4")
				.nom("hsouna")
				.prenom("hsouna")
				.build();
		membreRepository.save(Ech2);








	}


}



