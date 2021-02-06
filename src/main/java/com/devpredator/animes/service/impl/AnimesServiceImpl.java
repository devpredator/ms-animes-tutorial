/**
 * 
 */
package com.devpredator.animes.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.animes.entity.Anime;
import com.devpredator.animes.repository.AnimesRepository;
import com.devpredator.animes.service.AnimesService;

/**
 * @author DevPredator
 * @version 1.0 06/02/2021
 * Clase que implementa los metodos de logica de negocio de la interface de AnimesService.
 */
@Service
public class AnimesServiceImpl implements AnimesService {
	/**
	 * Bean Repository de spring inyectado para ejecutar el CRUD.
	 */
	@Autowired
	private AnimesRepository animesRepository;
	
	@Override
	public List<Anime> consultarAnimes() {

		List<Anime> animesDataSource = StreamSupport.stream(
				this.animesRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return animesDataSource;
	}

}
