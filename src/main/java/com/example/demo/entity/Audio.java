package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Audio extends Document {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String classification;

    int  DUREE;
    double TARIF;
    public Audio() {
    }

    public Audio(String classification, int DUREE, double TARIF) {
        super();
        this.classification = classification;
        this.DUREE = DUREE;
        this.TARIF = TARIF;
    }



}
