package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

public class Vidéo extends Document{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    int duréeFilm;
    String mentionLégale;
    @Transient
    int DUREE;
    @Transient
    double TARIF;

    public Vidéo() {
    }

    public Vidéo(int duréeFilm, int DUREE, double TARIF, String mentionLégale) {
        super();
        this.duréeFilm = duréeFilm;
        this.DUREE = DUREE;
        this.TARIF = TARIF;
        this.mentionLégale = mentionLégale;
    }


    @Override
    public String toString() {
        return "Vidéo{" +
                "id=" + id +
                ", duréeFilm=" + duréeFilm +
                ", mentionLégale='" + mentionLégale + '\'' +
                ", DUREE=" + DUREE +
                ", TARIF=" + TARIF +
                '}';
    }

    public int getDuréeFilm() {
        return duréeFilm;
    }

    public void setDuréeFilm(int duréeFilm) {
        this.duréeFilm = duréeFilm;
    }

    public String getMentionLégale() {
        return mentionLégale;
    }

    public void setMentionLégale(String mentionLégale) {
        this.mentionLégale = mentionLégale;
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
