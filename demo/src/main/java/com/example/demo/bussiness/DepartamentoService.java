package com.example.demo.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departamento;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	DepartamentoRepository repository ; 
	
	public Iterable<Departamento> listDepartamentos() {
		return repository.findAll();
	}

}
