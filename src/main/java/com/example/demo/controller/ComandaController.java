package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.negocio.Comanda;
import com.example.demo.modelo.service.ComandaService;

@RestController
@RequestMapping("/api/comanda")
public class ComandaController {

	@Autowired
	private ComandaService service;
	
	@RequestMapping
	public List<Comanda> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Comanda> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Comanda comanda) {
		service.incluir(comanda);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public ComandaService getService() {
		return service;
	}
	public void setService(ComandaService service) {
		this.service = service;
	}
}