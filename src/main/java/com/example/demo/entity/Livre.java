package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Livre extends Document{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    int nombrePage;
    @Transient
    int DUREE;
    @Transient
    double TARIF;

    public Livre() {
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", nombrePage=" + nombrePage +
                ", DUREE=" + DUREE +
                ", TARIF=" + TARIF +
                '}';
    }

    public Livre(String code, String titre, String auteur, String année, boolean empruntable, boolean emprunté, int nbEmprunts, int nombrePage, int DUREE, double TARIF) {
        super();
        this.nombrePage = nombrePage;
        this.DUREE = DUREE;
        this.TARIF = TARIF;
    }

    public int getNombrePage() {
        return nombrePage;
    }

    public void setNombrePage(int nombrePage) {
        this.nombrePage = nombrePage;
    }

    public int getDUREE() {
        return DUREE;
    }

    public void setDUREE(int DUREE) {
        this.DUREE = DUREE;
    }

    public double getTARIF() {
        return TARIF;
    }

    public void setTARIF(double TARIF) {
        this.TARIF = TARIF;
    }
}
