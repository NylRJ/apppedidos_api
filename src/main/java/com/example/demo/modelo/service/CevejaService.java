package com.example.demo.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.negocio.Cerveja;
import com.example.demo.modelo.repository.ICervejaRepository;

@Service
public class CevejaService {
	
	@Autowired
	private ICervejaRepository repository;

	public List<Cerveja> obterLista(){
		return (List<Cerveja>)repository.findAll();
	}
	
	public Optional<Cerveja> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Cerveja game) {
		repository.save(game);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public ICervejaRepository getRepository() {
		return repository;
	}
	public void setRepository(ICervejaRepository repository) {
		this.repository = repository;
	}
}