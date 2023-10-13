package com.example.Membre_service.service;

import com.example.Membre_service.model.EnseignantChercheur;
import com.example.Membre_service.model.Etudiant;
import com.example.Membre_service.model.Membre;
import com.example.Membre_service.repository.EnseignantChercheurRepository;
import com.example.Membre_service.repository.EtudiantRepository;
import com.example.Membre_service.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberImpl implements IMemberService {
    @Autowired
    MembreRepository memberRepository;
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EnseignantChercheurRepository enseignantChercheurRepository;
    public Membre addMember(Membre m) {
        memberRepository.save(m);
        return m;
    }
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
    public Membre updateMember(Membre m) {
        return memberRepository.saveAndFlush(m);
    }
    public Membre findMember(Long id) {
        Membre m= (Membre)memberRepository.findById(id).get();
        return m;
    }

    @Override
    public List<Membre> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Membre findByCin(String cin) {
        return memberRepository.findByCin(cin);
    }

    @Override
    public Membre findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    @Override
    public List<Membre> findByNom(String nom) {
        return memberRepository.findByNom(nom);
    }

    @Override
    public List<Etudiant> findByDiplome(String diplome) {
        return memberRepository.findByDiplome(diplome);
    }

    @Override
    public List<EnseignantChercheur> findByGrad(String grade) {
        return memberRepository.findByGrad(grade);
    }

    @Override
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        return memberRepository.findByEtablissement(etablissement);
    }

    @Override
    public void AffecterEtudiantToEnseignant(Long idEtd, Long idEns) {
        Etudiant etudiant = etudiantRepository.findById(idEtd).get();
        EnseignantChercheur enseignantChercheur =enseignantChercheurRepository.findById(idEns).get();
        etudiant.setEncadrant(enseignantChercheur);
        etudiantRepository.save(etudiant);
    }

    @Override
    public void findAllEtudiantByEncadrant(Long idEns) {
        EnseignantChercheur enseignantChercheur=enseignantChercheurRepository.findById(idEns).get();
        List<Etudiant> etudiants=etudiantRepository.findEtudiantByEncadrant(enseignantChercheur);

    }
}