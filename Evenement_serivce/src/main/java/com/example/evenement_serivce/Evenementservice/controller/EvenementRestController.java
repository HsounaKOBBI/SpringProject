package com.example.evenement_serivce.Evenementservice.controller;

import com.example.evenement_serivce.Evenementservice.entity.Evenement;
import com.example.evenement_serivce.Evenementservice.service.EvenementImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@CrossOrigin
@RestController
@AllArgsConstructor
public class EvenementRestController {
    EvenementImpl evenementService;

    @RequestMapping(value = "/evenements", method = RequestMethod.GET)
    public List<Evenement> findAllEvenements() {
        return evenementService.findAll();
    }

    @GetMapping(value = "/evenements/{id}")
    public Evenement findEvenementById(@PathVariable Long id) {
        return evenementService.findEvenement(id);
    }

    @PostMapping(value = "/evenements")
    public Evenement addEvenement(@RequestBody Evenement evenement) {
        return evenementService.addEvenement(evenement);
    }

    @DeleteMapping(value = "/evenements/{id}")
    public void deleteEvenement(@PathVariable Long id) {
        evenementService.deleteEvenement(id);
    }

    @PutMapping(value = "/evenements/{id}")
    public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement evenement) {
        evenement.setId(id);
        return evenementService.updateEvenement(evenement);
    }
}
