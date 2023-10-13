package com.example.publicationsservice.dao;

import com.example.publicationsservice.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;
import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    List<Publication> findByTitre(String titre);
    List<Publication> findByDate(Date date);
    List<Publication> findByLien(String lien);
    List<Publication> findByType(String type);
    List<Publication> findBySourcepdf(String sourcepdf);
}
