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
	
	@Column(name="dia")
	private String dia;
	
	@Column(name="hora")
	private String hora;
	
	@Column(name="solenidade")
	private String solenidade;

	public PAROQUIA_Evento_Model() {
		
	}
		
}
