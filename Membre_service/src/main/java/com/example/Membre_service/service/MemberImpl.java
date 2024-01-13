package com.example.Membre_service.service;

import com.example.Membre_service.Bean.PublicationBean;
import com.example.Membre_service.model.*;
import com.example.Membre_service.proxies.PublicationProxyService;
import com.example.Membre_service.repository.EnseignantChercheurRepository;
import com.example.Membre_service.repository.EtudiantRepository;
import com.example.Membre_service.repository.MembrePubRepository;
import com.example.Membre_service.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberImpl implements IMemberService {
    @Autowired
    MembreRepository memberRepository;
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EnseignantChercheurRepository enseignantChercheurRepository;

    @Autowired
    MembrePubRepository membrepubrepository;
    @Autowired
    PublicationProxyService proxy ;


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

    @Override
    public List<Etudiant> findEtudiantsEncadresParEnseignant(Long idEns) {
        EnseignantChercheur enseignant = enseignantChercheurRepository.findById(idEns).get();
        return etudiantRepository.findByEncadrant(enseignant);

    }

    @Override
    public void affecterEtudianttoEnseignantChercheur(Long idEtud, Long idEns) {
        Etudiant etd = etudiantRepository.findById(idEtud).get();
        EnseignantChercheur ens =enseignantChercheurRepository.findById(idEns).get();
        etd.setEncadrant(ens);
        etudiantRepository.save(etd);

    }


    @Override
    public void affecterauteurTopublication(Long idauteur, Long idpub)
    {
        Membre mbr= memberRepository.findById(idauteur).get();
        Membre_Publication mbs= new Membre_Publication();
        mbs.setAuteur(mbr);
        mbs.setId(new Membre_Pub_Id(idpub, idauteur));
        membrepubrepository.save(mbs);
    }
    @Override
    public List<PublicationBean> findPublicationparauteur(Long idauteur) {
        List<PublicationBean> pubs=new ArrayList<PublicationBean>();
        Membre auteur= memberRepository.findById(idauteur).get();
        List< Membre_Publication>
                idpubs=membrepubrepository.findByAuteur(auteur);
        idpubs.forEach(s->{
                    System.out.println(s);
                    pubs.add(proxy.findPublicationById(s.getId().getPublication_id()));
                }
        );
        return pubs;
    }
}