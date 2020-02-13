/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.stazi.jpahibernate.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author errab
 */
@Entity
@Table(name = "realisateur")
public class Realisateur extends Personne {

    @OneToMany(mappedBy = "realisateur")
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
