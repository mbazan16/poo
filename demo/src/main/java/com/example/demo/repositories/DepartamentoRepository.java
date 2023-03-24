package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Departamento;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Integer> {

}
