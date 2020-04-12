package com.example.demo.modelo.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TCachca")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Cachaca extends Produto {

	private String tipo;

	public Cachaca() {
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getTipo());
	}
	
	public Cachaca(String tipo) {
		this();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}