package com.PAROQUIA.grupo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class PAROQUIA_Perfil_Model {

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

	public PAROQUIA_Perfil_Model() {
		
	}
	
	public PAROQUIA_Perfil_Model(Long id, String username, String email, String telephone, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}
	
	public PAROQUIA_Perfil_Model(String username, String email, String telephone, String password) {
		this.username = username;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}
	
	public void setId (long id) {
		this.id = id;
	}
	
	public Long getId () {
		return id;
	}
	
	public void setUsername (String username) {
		this.username = username;
	}
	
	public String getUsername () {
		return username;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setTelephone (String telephone) {
		this.telephone = telephone;
	}
	
	public String GetTelephone () {
		return telephone;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public String getPassword () {
		return password;
	}

	@Override
	public String toString() {
		return "PAROQUIA_User_Model [id=" + id + ", username=" + username + ", email=" + email + ", telephone="
				+ telephone + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
}
