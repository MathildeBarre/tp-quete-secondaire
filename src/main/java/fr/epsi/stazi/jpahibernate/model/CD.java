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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author errab
 */
@Entity
@Table(name = "cd")
public class CD extends Article {
    
    @ManyToOne
    private StyleMusical style;
    
    @ManyToMany
    @JoinTable(name = "cd_artistes",
            joinColumns = {
                @JoinColumn(name = "cd_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "artiste_id")})
    private List<Artiste> artistes;

    /**
     * @return the style
     */
    public StyleMusical getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(StyleMusical style) {
        this.style = style;
    }

    /**
     * @return the artistes
     */
    public List<Artiste> getArtistes() {
        return artistes;
    }

    /**
     * @param artistes the artistes to set
     */
    public void setArtistes(List<Artiste> artistes) {
        this.artistes = artistes;
    }
}
