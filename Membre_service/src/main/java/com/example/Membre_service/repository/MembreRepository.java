package com.example.Membre_service.repository;

import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembreRepository extends JpaRepository<Membre,Long> {
    public Membre findByCin(String cin);
    public Membre findByEmail(String email);
    public List<Membre> findByNom(String nom);
    public List<Etudiant> findByDiplome(String diplome);

    public List<EnseignantChercheur> findByGrad(String grad);
    public List<EnseignantChercheur> findByEtablissement(String etablissement);
}
