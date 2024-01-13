package com.example.demo.controller;

import com.example.demo.entity.CategoriClient;
import com.example.demo.entity.Client;
import com.example.demo.service.CatégorieService;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping("/allclients")
    public List<Client> Getallclient(){
        return this.clientService.getallclients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/updateClient/{id}")
    public Client updateClient(@PathVariable Long id,
                               @RequestParam(required = false) String nom,
                               @RequestParam(required = false) String prenom,
                               @RequestParam(required = false) String adress,
                               @RequestParam(required = false) Date dateinscreption,
                               @RequestParam(required = false) Date dateRenouvellement,
                               @RequestParam(required = false) int nbEmpruntsEffectues,
                               @RequestParam(required = false) int nbEmpruntsDepasses,
                               @RequestParam(required = false) int codeReduction) {
        return clientService.updateClient(id, nom, prenom, adress, dateinscreption,
                dateRenouvellement, nbEmpruntsEffectues, nbEmpruntsDepasses, codeReduction);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }





    @Autowired
    private CatégorieService catégorieService;

    @GetMapping("/allcategorie")
    public List<CategoriClient> getAllCategoriClients() {
        return catégorieService.getallCategoriClients();
    }

    @GetMapping("/categorie/{id}")
    public CategoriClient getCategoriClientById(@PathVariable Long id) {
        return catégorieService.getaddClientCategoriById(id);
    }

    @PostMapping("/addcategorie")
    public CategoriClient addCategoriClient(@RequestBody CategoriClient categoriClient) {
        return catégorieService.addClientCategori(categoriClient);
    }

    @PutMapping("/updateClientcategorie{id}")
    public CategoriClient updateCategoriClient(@PathVariable Long id,
                                               @RequestParam(required = false) String nomCat,
                                               @RequestParam(required = false) int nbEmpruntsMax,
                                               @RequestParam(required = false) double cotisation,
                                               @RequestParam(required = false) double coeTarif,
                                               @RequestParam(required = false) double coefDurée,
                                               @RequestParam(required = false) boolean codeReductionActif) {
        return catégorieService.updateCategoriClient(id, nomCat, nbEmpruntsMax, cotisation, coeTarif, coefDurée, codeReductionActif);
    }

    @DeleteMapping("/deletecategorie/{id}")
    public void deleteCategoriClient(@PathVariable Long id) {
        catégorieService.deleteCategoriClient(id);
    }


}
