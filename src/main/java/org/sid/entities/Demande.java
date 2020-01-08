package org.sid.entities;
<<<<<<< HEAD

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Demande implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue
		Long id;
		String objet;
		public Demande() {
			super();
			// TODO Auto-generated constructor stub
		}
		@OneToOne(fetch = FetchType.LAZY, optional = true)
		@JoinColumn(name = "type_id", nullable = true)
		TypeService type;
		
		public Demande(Long id, String objet, String description) {
			super();
			this.id = id;
			this.objet = objet;
			Description = description;
		}
		String Description;
		public String getObjet() {
			return objet;
		}
		public void setObjet(String objet) {
			this.objet = objet;
		}
		public String getDescription() {
			return Description;
		}
		public TypeService getType() {
			return type;
		}
		public void setType(TypeService type) {
			this.type = type;
		}
		public void setDescription(String description) {
			Description = description;
		}
=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class Demande implements Serializable {
    @Id @GeneratedValue
    Long id;
    @Size(min = 5, max =50 )
    int id_user;
    @Size(min = 5, max =50 )
    int id_service;

    @Size(min = 5, max =50 )
    String titre;
    @Size(min = 10, max =60 )
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Demande() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Demande(Long id,String titre,String description) {
        super();
        this.id = id;
        this.titre = titre;
        this.description=description;
    }
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
}
