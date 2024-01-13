package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoriClient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String nomCat;
    int nbEmpruntsMax ;
    double cotisation;
    double coeTarif;
    double coefDurée;
    boolean codeReductionActif;

    public String getNomCat() {
        return nomCat;
    }

@OneToMany(mappedBy = "categoriClient",fetch = FetchType.EAGER)
List<Client> clients ;












    @Override
    public String toString() {
        return "CategoriClient{" +
                "id=" + id +
                ", nomCat='" + nomCat + '\'' +
                ", nbEmpruntsMax=" + nbEmpruntsMax +
                ", cotisation=" + cotisation +
                ", coeTarif=" + coeTarif +
                ", coefDurée=" + coefDurée +
                ", codeReductionActif=" + codeReductionActif +
                '}';
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public int getNbEmpruntsMax() {
        return nbEmpruntsMax;
    }

    public void setNbEmpruntsMax(int nbEmpruntsMax) {
        this.nbEmpruntsMax = nbEmpruntsMax;
    }

    public double getCotisation() {
        return cotisation;
    }

    public void setCotisation(double cotisation) {
        this.cotisation = cotisation;
    }

    public double getCoeTarif() {
        return coeTarif;
    }

    public void setCoeTarif(double coeTarif) {
        this.coeTarif = coeTarif;
    }

    public double getCoefDurée() {
        return coefDurée;
    }

    public void setCoefDurée(double coefDurée) {
        this.coefDurée = coefDurée;
    }

    public boolean isCodeReductionActif() {
        return codeReductionActif;
    }

    public void setCodeReductionActif(boolean codeReductionActif) {
        this.codeReductionActif = codeReductionActif;
    }

    public CategoriClient() {
    }

    public CategoriClient(String nomCat, int nbEmpruntsMax, double cotisation, double coeTarif, double coefDurée, boolean codeReductionActif,List<Client> clients) {
        this.nomCat = nomCat;
        this.nbEmpruntsMax = nbEmpruntsMax;
        this.cotisation = cotisation;
        this.coeTarif = coeTarif;
        this.coefDurée = coefDurée;
        this.codeReductionActif = codeReductionActif;
        this.clients =clients;
    }
}
