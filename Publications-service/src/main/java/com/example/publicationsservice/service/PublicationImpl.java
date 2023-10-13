package com.example.publicationsservice.service;

import com.example.publicationsservice.dao.PublicationRepository;
import com.example.publicationsservice.entity.Publication;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class PublicationImpl implements IPublicationService{
    PublicationRepository publicationRepository;

    @Override
    public Publication addPublication(Publication publication) {
        publicationRepository.save(publication);
        return publication;
    }

    @Override
    public Publication findPublication(Long id) {
        return publicationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Publication> findAll() {
        return (List<Publication>) publicationRepository.findAll();
    }

    @Override
    public void deletePublication(Long id) {
        publicationRepository.deleteById(id);


    }

    @Override
    public Publication updatePublication(Publication publication) {
        return publicationRepository.saveAndFlush(publication);
    }
}
