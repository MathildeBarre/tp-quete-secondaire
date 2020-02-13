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
@Table(name = "artiste")
public class Artiste extends Personne{
    
    @ManyToMany
    @JoinTable(name = "dvd_acteurs",
            joinColumns = {
                @JoinColumn(name = "acteur_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "dvd_id")})
    private List<CD> cds;

    /**
     * @return the cds
     */
    public List<CD> getCds() {
        return cds;
    }

    /**
     * @param cds the cds to set
     */
    public void setCds(List<CD> cds) {
        this.cds = cds;
    }
}
