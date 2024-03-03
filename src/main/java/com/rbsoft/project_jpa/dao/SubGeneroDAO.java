/**
 * 
 */
package com.rbsoft.project_jpa.dao;

import java.util.List;

import com.rbsoft.project_jpa.entity.SubGenero;

/**
 * @author RBSOFT
 * Interface DAO que permite realizar un CRUD con JPA para la tabla subgenero.
 *
 */
public interface SubGeneroDAO {

	
	/**
	 * Metodo que permita guardar un subgenero
	 * @param subGenero {@link SubGenero} Objeto a guardar
	 * */
	void guardar(SubGenero subGenero);
	
	

	/**
	 * Metodo que permita actulizar un subgenero
	 * @param subGenero {@link SubGenero} Objeto a actulizar
	 * */
	void actualizar (SubGenero subGenero);
	
	
	/**
	 * Metodo que permita eliminar un subgenero por medio del IdSubGenero
	 * @param id {@link Long} identificador a eliminar. 
	 * 
	 * */
	void eliminar (Long idSubGenero);
	
	/**
	 * Metodo para obtener una lista de los subgeneros 
	 * @return {@link List} lista de los subgeneros almacenados. 
	 * 
	 * */
	List<SubGenero> consulta();
	
	
	/**
	 * Metodo para obtener una lista de los subgeneros 
	 *  @param idSubGenero {@link Long} identificado
	 *  @return {@link SubGenero} lista de los subgeneros almacenados. 
	 * */
	SubGenero consultarById(Long idSubGenero);
}
