package com.example.Membre_service.repository;

import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public List<Etudiant> findEtudiantByEncadrant(EnseignantChercheur enseignantChercheur);
}
