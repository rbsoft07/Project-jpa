package com.rbsoft.project_jpa.dao.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.DisplayName;

/**
 * @author RBSOFT
 * Clase para realizar la pruebas de la implementacion de SubGeneroDAOImpl
 * */

import org.junit.jupiter.api.Test;

import com.rbsoft.project_jpa.dao.SubGeneroDAO;
import com.rbsoft.project_jpa.dao.impl.SubGeneroDAOImpl;
import com.rbsoft.project_jpa.entity.Genero;
import com.rbsoft.project_jpa.entity.SubGenero;

class SubGeneroDAOImplTest {

	private SubGeneroDAO objSubGeneroDao = new SubGeneroDAOImpl();
	
	@Test
	void testGuardar() {
		SubGenero objSubGenero = new SubGenero();
		objSubGenero.setDescripcion("Hard Core");
		objSubGenero.setFechaCreacion(LocalDateTime.now());
		objSubGenero.setFechaModificacion(LocalDateTime.now());
		objSubGenero.setEstatus(true);
		
		
		Genero objGenero = new Genero();
		objGenero.setDescripcion("Metal");
		objGenero.setFechaCreacion(LocalDateTime.now());
		objGenero.setEstatus(true);
		
		objSubGenero.setGenero(objGenero);
		
		this.objSubGeneroDao.guardar(objSubGenero);
		
	}

	@Test
	@DisplayName("ActualizarSuGenerosRealizandoConsulta")
	void testActualizar() {
		SubGenero objSubGenero = this.objSubGeneroDao.consultarById(12L);
		
		objSubGenero.setDescripcion("Blues Rock");
		objSubGenero.getGenero().setDescripcion("Blues Rock");
		
		this.objSubGeneroDao.actualizar(objSubGenero);
		
		
	}

	@Test
	@DisplayName("EliminarSuGenerosRealizandoConsulta")
	void testEliminar() {
		 this.objSubGeneroDao.eliminar(12L);
		
	}

	@Test
	void testConsulta() {
		List<SubGenero> lstSubGenerosConsultados = this.objSubGeneroDao.consulta();
		
		assertTrue(lstSubGenerosConsultados.size() > 0);
			
		for (SubGenero subGenero : lstSubGenerosConsultados) {
			System.out.println("SubGenero : " + subGenero.getDescripcion());
			System.out.println("Genero    : " + subGenero.getGenero().getDescripcion());
			System.out.println("Estado    : " + subGenero.isEstatus());
			System.out.println();
		}
	}

	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
