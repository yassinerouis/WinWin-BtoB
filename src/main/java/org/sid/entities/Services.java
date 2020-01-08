package org.sid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Services {
	
	@Id
	@GeneratedValue
	private long id;
	private String type;
	private String description;
	private short rating;
	private String adress;
	@Column(length=13)
	private String contact;
	private String images;
	
	public Services() {
		super();
	}

	public Services(String type, String description, short rating,
			String adress, String contact, String images) {
		super();
		this.type = type;
		this.description = description;
		this.rating = rating;
		this.adress = adress;
		this.contact = contact;
		this.images = images;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getRating() {
		return rating;
	}

	public void setRating(short rating) {
		this.rating = rating;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
	
	
	
	

}
