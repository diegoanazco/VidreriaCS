package com.gpch.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {
	private long id;
	private String nombre;
	private String dimension;
	private long unidad;
	private float precio;
	private long espesor;
	
	public Productos() {
		
	}
	
	public Productos(long id, String nombre, String dimension, long unidad, float precio, long espesor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dimension = dimension;
		this.unidad = unidad;
		this.precio = precio;
		this.espesor = espesor;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "dimension", nullable = false)
	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	@Column(name = "unidad", nullable = false)
	public long getUnidad() {
		return unidad;
	}

	public void setUnidad(long unidad) {
		this.unidad = unidad;
	}

	@Column(name = "precio", nullable = false)
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Column(name = "espesor", nullable = false)
	public long getEspesor() {
		return espesor;
	}

	public void setEspesor(long espesor) {
		this.espesor = espesor;
	}
}
