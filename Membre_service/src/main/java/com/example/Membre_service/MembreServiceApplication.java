package com.example.Membre_service;

import java.util.Date;

import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;
import com.example.Membre_service.repository.MembreRepository;
import com.example.Membre_service.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.AllArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MembreServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MembreServiceApplication.class, args);
	}


	/* salem*/
	/* salem branche test*/
	/* bch nahy commit*/

}