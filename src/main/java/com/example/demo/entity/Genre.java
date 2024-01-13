package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    int nbEmprunts=0;
    String nom;

    public Genre() {
    }

    public Genre(int nbEmprunts, String nom,List<Document> documents) {
        this.nbEmprunts = nbEmprunts;
        this.nom = nom;
        this.documents= documents;
    }

    public int getNbEmprunts() {
        return nbEmprunts;
    }

    public void setNbEmprunts(int nbEmprunts) {
        this.nbEmprunts = nbEmprunts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    @OneToMany(mappedBy = "genre",fetch = FetchType.EAGER)
    List<Document> documents ;


    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", nbEmprunts=" + nbEmprunts +
                ", nom='" + nom + '\'' +
                '}';
    }
}
