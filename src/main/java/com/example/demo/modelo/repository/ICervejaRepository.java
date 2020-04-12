package com.example.demo.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.negocio.Cerveja;

public interface ICervejaRepository extends CrudRepository<Cerveja, Integer> {

}
