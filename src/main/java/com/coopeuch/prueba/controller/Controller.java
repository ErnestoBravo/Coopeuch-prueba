package com.coopeuch.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coopeuch.prueba.model.Tarea;
import com.coopeuch.prueba.service.TareaServiceImpl;
import com.coopeuch.prueba.to.GenericResponse;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	TareaServiceImpl tareaService;

	@PostMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tarea> listaTareas() {
		return tareaService.getListaTareas();
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public GenericResponse agregarTarea(@RequestBody final Tarea tarea) {
		return tareaService.agregarTarea(tarea);
	}

	@PostMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public GenericResponse removerTarea(@RequestBody final Tarea tarea) {
		return tareaService.removerTarea(tarea);
	}

	@PostMapping(path = "/edit", produces = MediaType.APPLICATION_JSON_VALUE)
	public GenericResponse editarTarea(@RequestBody final Tarea tarea) {
		return tareaService.editarTarea(tarea);
	}

}
