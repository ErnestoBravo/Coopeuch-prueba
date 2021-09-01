package com.coopeuch.prueba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coopeuch.prueba.model.Tarea;
import com.coopeuch.prueba.repository.Repository;
import com.coopeuch.prueba.to.GenericResponse;

@Service
public class TareaServiceImpl implements ITareaService {

	@Autowired
	private Repository repository;

	public List<Tarea> getListaTareas() {
		List<Tarea> listaTareas = new ArrayList<Tarea>();

		try {
			listaTareas = repository.findAll();

		} catch (Exception e) {
			return null;
		}

		return listaTareas;
	}

	public GenericResponse agregarTarea(Tarea tarea) {

		GenericResponse response = new GenericResponse();

		try {

			if ("".equals(tarea.getDescripcion()) || tarea.getDescripcion() == null
					|| "".equals(tarea.getFechaCreacion()) || tarea.getFechaCreacion() == null
					|| "".equals(tarea.getVigente()) || tarea.vigente == null) {

				response.setStatus("1");
				response.setMessage("Todos los Campos son requeridos.");
			} else {
				repository.save(tarea);

				response.setStatus("0");
				response.setMessage("Tarea Agregada OK");
			}

		} catch (Exception e) {
			response.setStatus("1");
			response.setMessage("Ocurrio un Error: " + e.getMessage());
		}

		return response;
	}

	public GenericResponse removerTarea(Tarea tarea) {
		GenericResponse response = new GenericResponse();
		try {
			tarea.setFechaCreacion(new Date());
			repository.delete(tarea);

			response.setStatus("0");
			response.setMessage("Tarea eliminada OK");

		} catch (Exception e) {
			response.setStatus("1");
			response.setMessage("Ocurrio un Error: " + e.getMessage());
		}

		return response;
	}

	public GenericResponse editarTarea(Tarea tarea) {
		GenericResponse response = new GenericResponse();
		try {

			if ("".equals(tarea.getId()) || tarea.getId() == null || "".equals(tarea.getDescripcion())
					|| tarea.getDescripcion() == null || "".equals(tarea.getFechaCreacion())
					|| tarea.getFechaCreacion() == null || "".equals(tarea.getVigente()) || tarea.vigente == null) {

				response.setStatus("1");
				response.setMessage("Todos los Campos son requeridos.");
			} else {
				repository.save(tarea);

				response.setStatus("0");
				response.setMessage("Tarea editada OK");
			}
		} catch (Exception e) {
			response.setStatus("1");
			response.setMessage("Ocurrio un Error: " + e.getMessage());
		}

		return response;
	}
}
