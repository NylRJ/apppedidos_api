package com.example.demo.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.negocio.Petisco;
import com.example.demo.modelo.repository.IPetiscoRepository;

@Service
public class PetiscoService {
	
	@Autowired
	private IPetiscoRepository repository;

	public List<Petisco> obterLista(){
		return (List<Petisco>)repository.findAll();
	}
	
	public Optional<Petisco> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Petisco livro) {
		repository.save(livro);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IPetiscoRepository getRepository() {
		return repository;
	}
	public void setRepository(IPetiscoRepository repository) {
		this.repository = repository;
	}
}