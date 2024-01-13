package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class FicheEmprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Date dateEmprunt;
    Date dateLimite ;
    Date dateRappel ;
    boolean depassé;


    @OneToOne(mappedBy = "ficheEmprunt",fetch = FetchType.EAGER)
    @JsonIgnore
    Document document;


    @ManyToOne(fetch = FetchType.EAGER)
    Client Client ;






    public FicheEmprunt(Date dateEmprunt, Date dateLimite, Date dateRappel, boolean depassé, double tarif,Document document) {
        this.dateEmprunt = dateEmprunt;
        this.dateLimite = dateLimite;
        this.dateRappel = dateRappel;
        this.depassé = depassé;
        this.tarif = tarif;
        this.document= document;
    }

    public FicheEmprunt() {
    }

    double tarif;

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public Date getDateRappel() {
        return dateRappel;
    }

    public void setDateRappel(Date dateRappel) {
        this.dateRappel = dateRappel;
    }

    public boolean isDepassé() {
        return depassé;
    }

    public void setDepassé(boolean depassé) {
        this.depassé = depassé;
    }

    public double getTarif() {
        return tarif;
    }

    @Override
    public String toString() {
        return "FicheEmprunt{" +
                "id=" + id +
                ", dateEmprunt=" + dateEmprunt +
                ", dateLimite=" + dateLimite +
                ", dateRappel=" + dateRappel +
                ", depassé=" + depassé +
                ", tarif=" + tarif +
                '}';
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }
}
