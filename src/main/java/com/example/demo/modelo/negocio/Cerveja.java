package com.example.demo.modelo.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TCeveja")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Cerveja extends Produto {

	private String nivel;

	public Cerveja() {
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getNivel());
	}
	
	public Cerveja(String nivel) {
		this();
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}