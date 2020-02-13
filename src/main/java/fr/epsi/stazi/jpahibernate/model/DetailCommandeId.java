/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.stazi.jpahibernate.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author errab
 */
public class DetailCommandeId implements Serializable{
    private Long article;
    
    private Long commande;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.article);
        hash = 67 * hash + Objects.hashCode(this.commande);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetailCommandeId other = (DetailCommandeId) obj;
        if (!Objects.equals(this.article, other.article)) {
            return false;
        }
        if (!Objects.equals(this.commande, other.commande)) {
            return false;
        }
        return true;
    }

    public DetailCommandeId() {
    }

    public DetailCommandeId(Long articleId, Long commandeId) {
        this.article = articleId;
        this.commande = commandeId;
    }
}
