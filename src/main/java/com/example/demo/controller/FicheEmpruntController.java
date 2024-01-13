package com.example.demo.controller;

import com.example.demo.entity.Client;
import com.example.demo.entity.FicheEmprunt;
import com.example.demo.service.FicheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/FicheEmprunt")
public class FicheEmpruntController {
    @Autowired
    FicheService ficheService;
    @GetMapping("/allfiche")
    public List<FicheEmprunt> Getallclient(){
        return this.ficheService.getallFicheEmprunt();
    }


    @PostMapping("/addfiche")
    public FicheEmprunt addClient(@RequestBody FicheEmprunt fiche) {
        return ficheService.addFicheEmprunt(fiche);
    }


    @PutMapping("/updateFicheEmprunt/{id}")
    public FicheEmprunt updateFicheEmprunt(@PathVariable Long id,
                                           @RequestParam(required = false) Date dateEmprunt,
                                           @RequestParam(required = false) Date dateLimite,
                                           @RequestParam(required = false) Date dateRappel,
                                           @RequestParam(required = false) boolean depassé) {
        return ficheService.updatefiche(id,dateEmprunt,dateLimite,dateRappel,depassé);
    }

    @DeleteMapping("/deleteclient/{id}")
    public void deleteClient(@PathVariable Long id) {
        ficheService.deleteFicheEmprunt(id);
    }


}
