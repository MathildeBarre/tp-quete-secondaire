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
public class Acteur extends Personne{
    
    @ManyToMany
    @JoinTable(name = "dvd_acteurs",
            joinColumns = {
                @JoinColumn(name = "acteur_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "dvd_id")})
    private List<DVD> dvds;

    /**
     * @return the dvds
     */
    public List<DVD> getDvds() {
        return dvds;
    }

    /**
     * @param dvds the dvds to set
     */
    public void setDvds(List<DVD> dvds) {
        this.dvds = dvds;
    }
}
