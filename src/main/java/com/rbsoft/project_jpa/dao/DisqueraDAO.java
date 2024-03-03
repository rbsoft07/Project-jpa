package com.rbsoft.project_jpa.dao;

import java.util.List;

import com.rbsoft.project_jpa.entity.Disquera;

/**
 * @author RBSOFT Interface que permite genera el DAO para las transacciones del
 *         CRUD de la tabla Disquera.
 * 
 */

public interface DisqueraDAO {

	void guardar(Disquera disquera);

	void actualizar(Disquera disquera);

	void eliminar(Long id);

	List<Disquera> consulta();

	Disquera consultaById(Long id);
	
	

	/**
	 * Metodo que permite consulta con JQL la disquera apartir de la descripcion. 
	 * @param {@link String } descripcion
	 * @return {@link Disquera}
	 * 
	 * */
	Disquera consultaByDescripcionJPQL(String descripcion);
	
	/**
	 * Metodo que permite consulta SQL Nativo la disquera apartir de la descripcion. 
	 * @param descripcion
	 * @return {@link Disquera}
	 * 
	 * */
	Disquera consultaByDescripcionNative(String descripcion);

}
