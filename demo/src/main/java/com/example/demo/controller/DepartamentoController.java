package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bussiness.DepartamentoService;
import com.example.demo.entities.Departamento;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	
	@Autowired
	DepartamentoService servicio;
	
	@GetMapping
	public Iterable<Departamento> list(){
		return servicio.listDepartamentos();
	}

}
