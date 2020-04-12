package com.example.demo.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.negocio.Comanda;

public interface IComandaRepository extends CrudRepository<Comanda, Integer> {

}
