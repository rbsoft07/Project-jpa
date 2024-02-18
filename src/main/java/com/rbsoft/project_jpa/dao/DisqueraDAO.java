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

}
