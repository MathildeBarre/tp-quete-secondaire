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
import javax.persistence.Table;

/**
 *
 * @author errab
 */
@Entity
@Table(name = "auteur")
public class Auteur extends Personne {

    @ManyToMany
    @JoinTable(name = "livre_auteurs",
            joinColumns = {
                @JoinColumn(name = "auteur_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "livre_id")})
    private List<Livre> livres;

    /**
     * @return the livres
     */
    public List<Livre> getLivres() {
        return livres;
    }

    /**
     * @param livres the livres to set
     */
    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

}
