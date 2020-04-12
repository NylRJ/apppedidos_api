package com.example.demo.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.negocio.Cachaca;
import com.example.demo.modelo.repository.ICachacaRepository;

@Service
public class CachacaService {
	
	@Autowired
	private ICachacaRepository repository;

	public List<Cachaca> obterLista(){
		return (List<Cachaca>)repository.findAll();
	}
	
	public Optional<Cachaca> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Cachaca revista) {
		repository.save(revista);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ICachacaRepository getRepository() {
		return repository;
	}
	public void setRepository(ICachacaRepository repository) {
		this.repository = repository;
	}
}