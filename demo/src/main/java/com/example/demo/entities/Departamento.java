package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
@NamedQuery(name ="Departamento.findAll",query = "SELECT d FROM Departamento d")
public class Departamento {
	@Id
	@Column(name="DEPARTMENT_ID")
	private Integer id;
	@Column(name="DEPARTMENT_NAME")
	private String nombre;
	@Column(name="MANAGER_ID")
	private Integer managerId;	
	@Column(name="LOCATION_ID")
	private Integer locationId;
	
	
	
	public Departamento() {
		
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getManagerId() {
		return managerId;
	}



	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}



	public Integer getLocationId() {
		return locationId;
	}



	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}



	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", managerId=" + managerId + ", locationId="
				+ locationId + "]";
	}

	

}
