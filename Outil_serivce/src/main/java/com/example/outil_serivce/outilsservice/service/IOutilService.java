package com.example.outil_serivce.outilsservice.service;


import com.example.outil_serivce.outilsservice.entity.Outil;

import java.util.List;

public interface IOutilService {
    Outil addOutil(Outil outil);
    Outil findOutil(Long id);
    List<Outil> findAll();
    public void deleteOutil(Long id);
    public Outil updateOutil(Outil outil);}
