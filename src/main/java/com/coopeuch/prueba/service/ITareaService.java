package com.coopeuch.prueba.service;

import java.util.List;

import com.coopeuch.prueba.model.Tarea;
import com.coopeuch.prueba.to.GenericResponse;

public interface ITareaService {

	public List<Tarea> getListaTareas();
	public GenericResponse agregarTarea(Tarea tarea);
	public GenericResponse removerTarea(Tarea tarea);
	public GenericResponse editarTarea(Tarea tarea);
	
}
