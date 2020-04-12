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

import com.example.demo.modelo.negocio.Cachaca;
import com.example.demo.modelo.service.CachacaService;

@RestController
@RequestMapping("/api/cachaca")
public class CachacaController {

	@Autowired
	private CachacaService service;
	
	@RequestMapping
	public List<Cachaca> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Cachaca> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Cachaca revista) {
		service.incluir(revista);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public CachacaService getService() {
		return service;
	}
	public void setService(CachacaService service) {
		this.service = service;
	}
}