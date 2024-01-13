package com.example.Membre_service.repository;

import com.example.Membre_service.model.Membre;
import com.example.Membre_service.model.Membre_Pub_Id;
import com.example.Membre_service.model.Membre_Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembrePubRepository extends JpaRepository<Membre_Publication, Membre_Pub_Id> {
    List<Membre_Publication> findByAuteur(Membre auteur);
}