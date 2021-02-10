/**
 * 
 */
package com.devpredator.animes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devpredator.animes.dto.PersonaDTO;
import com.devpredator.animes.entity.Persona;
import com.devpredator.animes.service.PersonaService;

/**
 * @author DevPredator
 * @version 1.0 27/05/2021
 * 
 * Controlador que define los servicios de personas.
 */
@RestController("persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaServiceImpl;
	
	@PostMapping(name = "consultarPersona")
	public ResponseEntity<?> consultarPersona(@RequestBody PersonaDTO personaDTO) {
		
		Persona personaConsultada = this.personaServiceImpl.consultarPersona(personaDTO.getUsuario(), personaDTO.getPassword());
		
		if (personaConsultada == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(personaConsultada);
	}
}
