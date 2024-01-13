package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Localisation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String salle;
    String rayon;

    public Localisation() {
    }

    public Localisation(String salle, String rayon,List<Document> documents) {
        this.salle = salle;
        this.rayon = rayon;
        this.documents=documents;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }


    @OneToMany(mappedBy = "localisation",fetch = FetchType.EAGER)
    List<Document> documents;


    @Override
    public String toString() {
        return "Localisation{" +
                "id=" + id +
                ", salle='" + salle + '\'' +
                ", rayon='" + rayon + '\'' +
                '}';
    }
}
