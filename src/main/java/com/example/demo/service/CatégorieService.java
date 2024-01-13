package com.example.demo.service;

import com.example.demo.entity.CategoriClient;
import com.example.demo.entity.Client;
import com.example.demo.repository.CatégorieClientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CatégorieService {
    @Autowired
    public CatégorieClientrepository catégorieClientrepository;
    public List<CategoriClient> getallCategoriClients(){
        return catégorieClientrepository.findAll();
    };
    public CategoriClient addClientCategori(CategoriClient categoriClient){
        return catégorieClientrepository.save(categoriClient);
    }
    public CategoriClient getaddClientCategoriById(Long categoriClientId){
        return catégorieClientrepository.findById(categoriClientId).orElse(null);
    }
    public void deleteCategoriClient(Long categoriClientId) {
        catégorieClientrepository.deleteById(categoriClientId);
    }

    public CategoriClient updateCategoriClient(Long categoriClientId, String nomCat, int nbEmpruntsMax,
                                               double cotisation, double coeTarif, double coefDurée,
                                               boolean codeReductionActif) {
        CategoriClient categoriClient = catégorieClientrepository.findById(categoriClientId)
                .orElseThrow(() -> new IllegalStateException("CategoriClient with id " + categoriClientId + " does not exist"));

        categoriClient.setNomCat(nomCat);
        categoriClient.setNbEmpruntsMax(nbEmpruntsMax);
        categoriClient.setCotisation(cotisation);
        categoriClient.setCoeTarif(coeTarif);
        categoriClient.setCoefDurée(coefDurée);
        categoriClient.setCodeReductionActif(codeReductionActif);

        return catégorieClientrepository.save(categoriClient);
    }


}
