package com.example.demo.service;

import com.example.demo.entity.Localisation;
import com.example.demo.repository.Localisationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LocalisationService {
    @Autowired
    Localisationrepository localisationrepository;
    public List<Localisation> getallclients(){
        return localisationrepository.findAll();
    };
    public Localisation addlocalisation(Localisation localisation){
        return localisationrepository.save(localisation);
    }
    public Localisation getClientById(Long localisationId){
        return localisationrepository.findById(localisationId).orElse(null);
    }
    public void deleteClient(Long clientId) {
        localisationrepository.deleteById(clientId);
    }

    public Localisation updateLocalisation(Long localisationId, String salle, String rayon) {
        Localisation localisation = localisationrepository.findById(localisationId)
                .orElseThrow(() -> new IllegalStateException("Localisation with id " + localisationId + " does not exist"));

        localisation.setSalle(salle);
        localisation.setRayon(rayon);

        return localisationrepository.save(localisation);
    }


}
