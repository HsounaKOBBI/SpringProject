package com.example.evenement_serivce.Evenementservice.service;


import com.example.evenement_serivce.Evenementservice.entity.Evenement;

import java.util.List;

public interface IEvenementService {
    Evenement addEvenement(Evenement eve);
    Evenement findEvenement(Long id);
    List<Evenement> findAll();
    public void deleteEvenement(Long id);
    public Evenement updateEvenement(Evenement eve);


}
