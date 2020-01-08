package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeService implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    Long id;

    String nom;

    String image;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TypeService() {
        super();
        // TODO Auto-generated constructor stub
    }
    public TypeService(Long id, String nom, String image) {
        super();
        this.id=id;
        this.nom=nom;
        this.image =image;
    }
}