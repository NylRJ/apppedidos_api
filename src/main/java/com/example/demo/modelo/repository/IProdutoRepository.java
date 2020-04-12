package com.example.demo.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.negocio.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer> {

}
