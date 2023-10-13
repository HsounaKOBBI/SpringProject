package com.example.outil_serivce.outilsservice.dao;
import com.example.outil_serivce.outilsservice.entity.Outil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OutilRepository extends JpaRepository<Outil, Long> {
    // Exemple de méthode de recherche personnalisée par source
    List<Outil> findBySource(String source);

    // Exemple de méthode de recherche personnalisée par date
    List<Outil> findByDate(Date date);

    // Exemple de méthode de recherche personnalisée par membre

}
