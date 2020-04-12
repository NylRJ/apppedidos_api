package com.example.demo.modelo.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPetisco")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Petisco extends Produto {

	private String titulo;

	public Petisco() {
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getTitulo());
	}
	
	public Petisco(String titulo) {
		this();
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}