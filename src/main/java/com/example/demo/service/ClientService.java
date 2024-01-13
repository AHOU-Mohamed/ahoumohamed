package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.repository.Clientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    public Clientrepository clientrepository;
     public List<Client> getallclients(){
         return clientrepository.findAll();
     };
     public Client addClient(Client client){
         return clientrepository.save(client);
     }
    public Client getClientById(Long clientId){
        return clientrepository.findById(clientId).orElse(null);
    }
    public void deleteClient(Long clientId) {
        clientrepository.deleteById(clientId);
    }

    public Client updateClient(Long clientId, String nom, String prenom, String adress, Date dateinscreption,
                               Date dateRenouvellement, int nbEmpruntsEffectues, int nbEmpruntsDepasses,
                               int codeReduction) {
        Client Client1 = clientrepository.findById(clientId).orElseThrow(()-> new IllegalStateException("client with id "+ clientId + " does not exist "));


        Client1.setNom(nom);
        Client1.setPrenom(prenom);
        Client1.setAdress(adress);
        Client1.setDateinscreption(dateinscreption);
        Client1.setDateRenouvellement(dateRenouvellement);
        Client1.setNbEmpruntsDepasses(nbEmpruntsDepasses);
        Client1.setNbEmpruntsEffectues(nbEmpruntsEffectues);
        Client1.setCodeReduction(codeReduction);

            return clientrepository.save(Client1);

    }


}
