package com.example.Membre_service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("ens")
public class EnseignantChercheur extends   Membre{
    private String etablissement;
    private String grad;
    @JsonIgnore
    @OneToMany(mappedBy = "encadrant")
    private List<Etudiant> etudiant;
    @Builder
    public EnseignantChercheur(Long id,  String cin,  String nom,  String prenom,
                    Date dateNaissance, byte[] photo,  String cv,  String email,String type_mbr,  String password,
                    String etablissement,  String grad) {
        super(id, cin, nom, prenom, dateNaissance, photo,cv, email, password,type_mbr,null);
        this.etablissement = etablissement;
        this.grad = grad;
            }

}

