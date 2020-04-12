package com.example.demo.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.negocio.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}
