package org.sid.entities;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class type_services implements Serializable {
    @Id @GeneratedValue
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

    public type_services() {
        super();
        // TODO Auto-generated constructor stub
    }
    public type_services(Long id, String nom, String image) {
        this.id=id;
        this.nom=nom;
        this.image =image;
    }
}
