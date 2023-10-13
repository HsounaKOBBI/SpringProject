package com.example.publicationsservice.service;


import com.example.publicationsservice.entity.Publication;

import java.util.List;

public interface IPublicationService {
    Publication addPublication(Publication publication);
    Publication findPublication(Long id);
    List<Publication> findAll();
    void deletePublication(Long id);
    Publication updatePublication(Publication publication);
}
