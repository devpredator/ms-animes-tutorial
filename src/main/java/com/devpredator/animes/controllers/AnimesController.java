/**
 * 
 */
package com.devpredator.animes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devpredator.animes.entity.Anime;
import com.devpredator.animes.service.AnimesService;

/**
 * @author DevPredator
 * @version 1.0 06/02/2021
 * Controlador que manipula el flujo de los servicios rest del microservicio de animes.
 */
@RestController
@RequestMapping("/animes")
public class AnimesController {
	
	@Autowired
	private AnimesService animesServiceImpl;

	@GetMapping
	@RequestMapping(value = "consultarAnimes", method = RequestMethod.GET)
	public ResponseEntity<?> consultarAnimes() {
		
		List<Anime> animesConsultados = this.animesServiceImpl.consultarAnimes();
		
		return ResponseEntity.ok(animesConsultados);
	}
}
