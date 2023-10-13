package com.example.outil_serivce.outilsservice.service;

import com.example.outil_serivce.outilsservice.dao.OutilRepository;
import com.example.outil_serivce.outilsservice.entity.Outil;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OutilImpl implements IOutilService{
    OutilRepository outilRepository;
    @Override
    public Outil addOutil(Outil outil) {
        outil=outilRepository.save(outil);
        return outil;
    }

    @Override
    public Outil findOutil(Long id) {
        Outil outil =(Outil)outilRepository.findById(id).get();
        return outil;
    }

    @Override
    public List<Outil> findAll() {
        List<Outil> outils= (List<Outil>) outilRepository.findAll();

        return outils;
    }

    @Override
    public void deleteOutil(Long id) {
        outilRepository.deleteById(id);

    }
    @Override
    public Outil updateOutil(Outil outil){

        return outilRepository.saveAndFlush(outil);
    }
}
