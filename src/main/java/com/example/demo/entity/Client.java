package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String nom;
    String prenom;
    String adress;

    public Client() {
    }












    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    CategoriClient categoriClient;



    @OneToMany(mappedBy = "Client",fetch = FetchType.EAGER)
    List<FicheEmprunt> ficheEmprunts;

    public Client(String nom, String prenom, String adress, Date dateinscreption, Date dateRenouvellement, int nbEmpruntsEffectues, int nbEmpruntsDepasses, int codeReduction, List<FicheEmprunt> ficheEmprunts) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.dateinscreption = dateinscreption;
        this.dateRenouvellement = dateRenouvellement;
        this.nbEmpruntsEffectues = nbEmpruntsEffectues;
        this.nbEmpruntsDepasses = nbEmpruntsDepasses;
        this.codeReduction = codeReduction;
        this.ficheEmprunts = ficheEmprunts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                ", dateinscreption=" + dateinscreption +
                ", dateRenouvellement=" + dateRenouvellement +
                ", nbEmpruntsEffectues=" + nbEmpruntsEffectues +
                ", nbEmpruntsDepasses=" + nbEmpruntsDepasses +
                ", codeReduction=" + codeReduction +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getDateinscreption() {
        return dateinscreption;
    }

    public void setDateinscreption(Date dateinscreption) {
        this.dateinscreption = dateinscreption;
    }

    public Date getDateRenouvellement() {
        return dateRenouvellement;
    }

    public void setDateRenouvellement(Date dateRenouvellement) {
        this.dateRenouvellement = dateRenouvellement;
    }

    public int getNbEmpruntsEffectues() {
        return nbEmpruntsEffectues;
    }

    public void setNbEmpruntsEffectues(int nbEmpruntsEffectues) {
        this.nbEmpruntsEffectues = nbEmpruntsEffectues;
    }

    public int getNbEmpruntsDepasses() {
        return nbEmpruntsDepasses;
    }

    public void setNbEmpruntsDepasses(int nbEmpruntsDepasses) {
        this.nbEmpruntsDepasses = nbEmpruntsDepasses;
    }

    public int getCodeReduction() {
        return codeReduction;
    }

    public void setCodeReduction(int codeReduction) {
        this.codeReduction = codeReduction;
    }

    Date dateinscreption ;
    Date dateRenouvellement ;
    int nbEmpruntsEffectues = 0;
    int nbEmpruntsDepasses = 0;
    int  codeReduction = 0;

}
