package com.example.Membre_service.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("etd")
public class Etudiant extends   Membre{
    private Date dateInscription;
    private String diplome;
    private String sujet;
    @ManyToOne
    private EnseignantChercheur encadrant;
    @Builder
    public Etudiant(  String cin,  String nom,  String prenom,
                     Date dateNaissance,
                      Date dateInscription,  String diplome,  String sujet,
                    EnseignantChercheur encadrant) {
        super(cin, nom, prenom, dateNaissance);
        this.dateInscription = dateInscription;
        this.diplome = diplome;
        this.sujet = sujet;
        this.encadrant = encadrant;
    }
}








