package org.sid.entities;

import java.io.Serializable;
<<<<<<< HEAD
=======

>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	Long id;
<<<<<<< HEAD
	
	String nom;
	
	String prenom;
	
	String telephone;
	
	String email;
	String password;
	
=======
	@Size(min = 3, max =30 )
	String nom;
	@Size(min = 3, max =30 )
	String prenom;
	@Column(length=12)
	String telephone;
	@Size(min = 10, max =30 )
	String email;
	@Size(min = 10, max =100 )
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
	String adresse;
	
	String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
<<<<<<< HEAD
	public String getPassword() {
		return password;
	}
	public User(Long id, String nom, String prenom, String telephone, String email, String password, String adresse,
			String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.type = type;
	}
	public void setPassword(String password) {
		this.password = password;
	}
=======
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
	
=======
	public User(long id, String nom, String prenom, String telephone, String email, String adresse, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.type = type;
	}
>>>>>>> b1a8700e4ea31839d69648f14a685228d018e1d5
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
