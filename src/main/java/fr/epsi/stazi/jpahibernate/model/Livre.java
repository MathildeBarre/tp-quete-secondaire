/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.stazi.jpahibernate.model;

import java.util.List;
import javax.persistence.Column;
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
@Table(name = "livre")
public class Livre extends Article{
    
    
    @ManyToMany
    @JoinTable(name = "livre_auteurs",
            joinColumns = {
                @JoinColumn(name = "livre_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "auteur_id")})
    private List<Auteur> auteurs;

    /**
     * @return the auteurs
     */
    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    /**
     * @param auteurs the auteurs to set
     */
    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
