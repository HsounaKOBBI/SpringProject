package com.example.Membre_service.service;

import com.example.Membre_service.Bean.PublicationBean;
import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;

import java.util.List;

public interface IMemberService {
    public Membre addMember(Membre m);
    public void deleteMember(Long id) ;
    public Membre updateMember(Membre p) ;
    public Membre findMember(Long id) ;
    public List<Membre> findAll();

    public Membre findByCin(String cin);
    public Membre findByEmail(String email);
    public List<Membre> findByNom(String nom);
    //recherche spécifique des étudiants
    public List<Etudiant> findByDiplome(String diplome);

    public List<EnseignantChercheur> findByGrad(String grade);
    public List<EnseignantChercheur> findByEtablissement(String etablissement);
    public void AffecterEtudiantToEnseignant(Long idEtd ,Long idEns);
    public void findAllEtudiantByEncadrant(Long idEns);

    public List<Etudiant> findEtudiantsEncadresParEnseignant(Long idEns);

    public void affecterEtudianttoEnseignantChercheur(Long idEtud,Long idEns);


    public void affecterauteurTopublication(Long idauteur, Long idpub);
    public List<PublicationBean>
    findPublicationparauteur (Long idauteur);
}