package com.example.demo.service;

import com.example.demo.entity.FicheEmprunt;
import com.example.demo.repository.FicheEmpruntrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FicheService {
    @Autowired
    public FicheEmpruntrepository ficheEmpruntrepository;
    public List<FicheEmprunt> getallFicheEmprunt(){
        return ficheEmpruntrepository.findAll();
    };
    public FicheEmprunt addFicheEmprunt(FicheEmprunt ficheEmprunt){
        return ficheEmpruntrepository.save(ficheEmprunt);
    }
    public FicheEmprunt getFicheEmpruntById(Long ficheEmpruntId){
        return ficheEmpruntrepository.findById(ficheEmpruntId).orElse(null);
    }
    public void deleteFicheEmprunt(Long ficheEmpruntId) {
        ficheEmpruntrepository.deleteById(ficheEmpruntId);
    }
    public FicheEmprunt updatefiche(Long ficheEmprunt1Id, Date dateEmprunt, Date dateLimite, Date dateRappel, boolean depassé) {
        FicheEmprunt ficheEmprunt1 = ficheEmpruntrepository.findById(ficheEmprunt1Id).orElseThrow(()-> new IllegalStateException("client with id "+ ficheEmprunt1Id + " does not exist "));


        ficheEmprunt1.setDateEmprunt(dateEmprunt);
        ficheEmprunt1.setDateLimite(dateLimite);
        ficheEmprunt1.setDateRappel(dateRappel);
        ficheEmprunt1.setDepassé(depassé);



        return ficheEmpruntrepository.save(ficheEmprunt1);

    }
}
