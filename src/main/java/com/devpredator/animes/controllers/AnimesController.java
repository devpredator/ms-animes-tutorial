/**
 * 
 */
package com.devpredator.animes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@PostMapping
	@RequestMapping(value = "guardarAnime", method = RequestMethod.POST)
	public ResponseEntity<?> guardarAnime(@RequestBody Anime anime) {
		
		Anime animeGuardado = this.animesServiceImpl.guardarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeGuardado);
	}
	
	@PutMapping
	@RequestMapping(value = "actualizarAnime", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarAnime(@RequestBody Anime anime) {
		
		Anime animeActualizado = this.animesServiceImpl.actualizarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeActualizado);
	}
	
	@DeleteMapping
	@RequestMapping(value = "eliminarAnime/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarAnime(@PathVariable Long id) {
		
		this.animesServiceImpl.eliminarAnime(id);
		
		return ResponseEntity.ok().build();
	}
}
