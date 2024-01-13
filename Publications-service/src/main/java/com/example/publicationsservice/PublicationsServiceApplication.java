package com.example.publicationsservice;

import com.example.publicationsservice.dao.PublicationRepository;
import com.example.publicationsservice.entity.* ;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
@AllArgsConstructor
public class PublicationsServiceApplication implements CommandLineRunner {
    PublicationRepository publicationRepository;

    public static void main(String[] args) {
        SpringApplication.run(PublicationsServiceApplication.class, args);
    }
    public void run(String... args) throws Exception {
        Publication pubs1= new Publication("article", new Date(),"an approach for testing soa systems" , "lien", "pdf");
        Publication pubs2= new Publication("chapitre de livre",new Date(), "towards cloud computing : issues and challenges", "lien", "pdf");
        Publication pubs3= new Publication("article",new Date(),"introducing blochain systems",  "lien", "pdf");
        publicationRepository.save(pubs1);
        publicationRepository.save(pubs2);
        publicationRepository.save(pubs3);
    }}