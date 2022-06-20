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

	public PAROQUIA_Evento_Model(Long id, String dia, String hora, String solenidade) {
		super();
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.solenidade = solenidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getSolenidade() {
		return solenidade;
	}

	public void setSolenidade(String solenidade) {
		this.solenidade = solenidade;
	}
		
}
