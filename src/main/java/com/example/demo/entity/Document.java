package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.apache.el.parser.AstFalse;

import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String code;
    String titre;
    String auteur;
    String année ;
    boolean empruntable = false;
    boolean emprunté = false;
    int nbEmprunts = 0;



@OneToOne(fetch = FetchType.EAGER)
    FicheEmprunt ficheEmprunt ;


@ManyToOne(fetch = FetchType.EAGER)
@JsonIgnore
Genre genre;

@ManyToOne(fetch = FetchType.EAGER)
@JsonIgnore
Localisation localisation ;





    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", année='" + année + '\'' +
                ", empruntable=" + empruntable +
                ", emprunté=" + emprunté +
                ", nbEmprunts=" + nbEmprunts +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getAnnée() {
        return année;
    }

    public void setAnnée(String année) {
        this.année = année;
    }

    public boolean isEmpruntable() {
        return empruntable;
    }

    public void setEmpruntable(boolean empruntable) {
        this.empruntable = empruntable;
    }

    public boolean isEmprunté() {
        return emprunté;
    }

    public void setEmprunté(boolean emprunté) {
        this.emprunté = emprunté;
    }

    public int getNbEmprunts() {
        return nbEmprunts;
    }

    public void setNbEmprunts(int nbEmprunts) {
        this.nbEmprunts = nbEmprunts;
    }

    public Document() {
    }

    public Document(String code, String titre, String auteur, String année, boolean empruntable, boolean emprunté, int nbEmprunts,Localisation localisation,Genre genre) {
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.année = année;
        this.empruntable = empruntable;
        this.emprunté = emprunté;
        this.nbEmprunts = nbEmprunts;
    }
}
