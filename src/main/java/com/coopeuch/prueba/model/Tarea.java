package com.coopeuch.prueba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@Column(name = "descripcion", nullable = false)
	public String descripcion;
	
	@Column(name = "fechaCreacion", nullable = false)
	public Date fechaCreacion;
	
	@Column(name = "vigente", nullable = false)
	public Boolean vigente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Boolean getVigente() {
		return vigente;
	}
	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}
	
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", vigente="
				+ vigente + "]";
	}
	

	
}
