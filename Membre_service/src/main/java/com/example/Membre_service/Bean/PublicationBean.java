package com.example.Membre_service.Bean;

import lombok.Data;

import java.util.Date;

@Data
public class PublicationBean {
    private Long id;
    private String type;
    private String titre;
    private String lien;
    private Date date;
    private String sourcePdf;
}
