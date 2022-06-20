package com.PAROQUIA.grupo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pastoral")
public class PAROQUIA_Pastoral_Model {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="criador_id")
	private Long criador_id;
	
	@Column(name="descricao")
	private String descricao;  
	
	@Column(name="grupos")
	private boolean grupos;
	
	@Column(name="intervalo")
	private int intervalo;
	
	public PAROQUIA_Pastoral_Model() {
		
	}
	
	public PAROQUIA_Pastoral_Model(String nome, Long criador_id, String descricao, boolean grupos, int intervalo) {
		super();
		this.nome = nome;
		this.criador_id = criador_id;
		this.descricao = descricao;
		this.grupos = grupos;
		this.intervalo = intervalo;
	}

	public PAROQUIA_Pastoral_Model(Long id, String nome, Long criador_id, String descricao, boolean grupos, int intervalo) {
		super();
		this.id = id;
		this.nome = nome;
		this.criador_id = criador_id;
		this.descricao = descricao;
		this.grupos = grupos;
		this.intervalo = intervalo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCriador_id() {
		return criador_id;
	}

	public void setCriador_id(Long criador_id) {
		this.criador_id = criador_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isGrupos() {
		return grupos;
	}
	
	public int getIntervalo() {
		return intervalo;
	}

	public void setGrupos(boolean grupos) {
		this.grupos = grupos;
	}
	
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	@Override
	public String toString() {
		return "Pastoral [id=" + id + ", nome=" + nome + ", criador_id=" + criador_id + ", descricao=" + descricao
				+ ", grupos=" + grupos + ", intervalo=" + intervalo + "]";
	}
}
