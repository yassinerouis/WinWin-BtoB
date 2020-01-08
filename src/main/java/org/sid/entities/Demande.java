package org.sid.entities;

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
		@OneToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "type_id", nullable = false)
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
		public void setDescription(String description) {
			Description = description;
		}
}
