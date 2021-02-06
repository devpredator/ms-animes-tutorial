/**
 * 
 */
package com.devpredator.animes.service;

import java.util.List;

import com.devpredator.animes.entity.Anime;

/**
 * @author DevPredator
 * @version 1.0 06/02/2021
 * Interface que contiene los metodos de logica de negocio para los animes.
 */
public interface AnimesService {
	/**
	 * Metodo que permite consultar un listado de animes
	 * @return listado de animes.
	 */
	List<Anime> consultarAnimes();
}
