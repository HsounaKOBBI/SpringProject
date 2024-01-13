package com.example.Membre_service.model;

import com.example.Membre_service.Bean.PublicationBean;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Table(name = "membre")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType =
        DiscriminatorType.STRING,length = 3)
@Getter@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Membre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String cin;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private byte[] photo;
    private String cv;
    private  String email;
    private String password;
    @Column(insertable=false, updatable=false)
    private String type_mbr;


    @Transient
    Collection<PublicationBean> pubs;
}