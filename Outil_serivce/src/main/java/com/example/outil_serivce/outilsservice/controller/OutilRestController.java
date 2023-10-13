package com.example.outil_serivce.outilsservice.controller;

import com.example.outil_serivce.outilsservice.entity.Outil;
import com.example.outil_serivce.outilsservice.service.OutilImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
public class OutilRestController {
    OutilImpl outilService;


    @RequestMapping(value = "/outils", method = RequestMethod.GET)
    public List<Outil> findAllOutils() {
        return outilService.findAll();
    }

    @GetMapping(value = "/outils/{id}")
    public Outil findOutilById(@PathVariable Long id) {
        return outilService.findOutil(id);
    }

    @PostMapping(value = "/outils")
    public Outil addOutil(@RequestBody Outil outil) {
        return outilService.addOutil(outil);
    }

    @DeleteMapping(value = "/outils/{id}")
    public void deleteOutil(@PathVariable Long id) {
        outilService.deleteOutil(id);
    }

    @PutMapping(value = "/outils/{id}")
    public Outil updateOutil(@PathVariable Long id, @RequestBody Outil outil) {
        outil.setId(id);
        return outilService.updateOutil(outil);
    }
}

