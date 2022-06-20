package com.PAROQUIA.grupo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Evento")
public class PAROQUIA_Evento_Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="E_mail")
	private String email;
	
	@Column(name="Telephone")
	private String telephone;
	
	@Column(name="Password")
	private String password;

	public PAROQUIA_Evento_Model() {
		
	}
		
}
