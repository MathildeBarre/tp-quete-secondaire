/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.stazi.jpahibernate.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author errab
 */
@Entity
@Table(name = "dvd")
public class DVD extends Article{

    @ManyToOne
    private Categorie categorie;
    
    @ManyToOne
    private Realisateur realisateur;

    @ManyToMany
    @JoinTable(name = "dvd_acteurs",
            joinColumns = {
                @JoinColumn(name = "dvd_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "acteur_id")})
    private List<Acteur> acteurs;

    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the realisateur
     */
    public Realisateur getRealisateur() {
        return realisateur;
    }

    /**
     * @param realisateur the realisateur to set
     */
    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    /**
     * @return the acteurs
     */
    public List<Acteur> getActeurs() {
        return acteurs;
    }

    /**
     * @param acteurs the acteurs to set
     */
    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }


}
