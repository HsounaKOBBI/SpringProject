package com.example.evenement_serivce.Evenementservice.dao;

import com.example.evenement_serivce.Evenementservice.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    List<Evenement> findByTitre(String titre);
    List<Evenement> findByDate(Date date);
    List<Evenement> findByLieu(String lieu);


}
