package com.example.demo.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.negocio.Comanda;
import com.example.demo.modelo.repository.IComandaRepository;

@Service
public class ComandaService {
	
	@Autowired
	private IComandaRepository repository;

	public List<Comanda> obterLista(){
		return (List<Comanda>)repository.findAll();
	}
	
	public Optional<Comanda> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void incluir(Comanda emprestimo) {
		repository.save(emprestimo);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IComandaRepository getRepository() {
		return repository;
	}
	public void setRepository(IComandaRepository repository) {
		this.repository = repository;
	}
}