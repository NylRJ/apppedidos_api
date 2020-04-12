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

import com.example.demo.modelo.negocio.Cerveja;
import com.example.demo.modelo.service.CevejaService;

@RestController
@RequestMapping("/api/cerveja")
public class CarvejaController {

	@Autowired
	private CevejaService service;
	
	@RequestMapping
	public List<Cerveja> obterLista(){
		return service.obterLista();
	}
	
	@RequestMapping("{id}")
	public Optional<Cerveja> obterPorId(@PathVariable Integer id) {
		return service.obterPorId(id);
	}
	
	@PostMapping
	public void incluir(@RequestBody Cerveja game) {
		service.incluir(game);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		service.excluir(id);
	}

	public CevejaService getService() {
		return service;
	}
	public void setService(CevejaService service) {
		this.service = service;
	}
}