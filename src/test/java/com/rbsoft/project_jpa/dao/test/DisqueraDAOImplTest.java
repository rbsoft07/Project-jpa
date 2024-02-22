/**
 * 
 */
package com.rbsoft.project_jpa.dao.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rbsoft.project_jpa.dao.DisqueraDAO;
import com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl;
import com.rbsoft.project_jpa.entity.Disquera;
import com.rbsoft.project_jpa.entity.Genero;

/**
 * @author RBSOFT
 *
 */
class DisqueraDAOImplTest {

	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
	
	
	/**
	 * Test method for {@link com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl#guardar(com.rbsoft.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Rbsoft Company");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl#actualizar(com.rbsoft.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		
		
		Disquera objDisquera = this.disqueraDAO.consultaById(12L);
		objDisquera.setDescripcion("Sony Disc");
		
		this.disqueraDAO.actualizar(objDisquera);
		
	}

	/**
	 * Test method for {@link com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl#eliminar(com.rbsoft.project_jpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 9L;
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl#consulta()}.
	 */
	@Test
	void testConsulta() {
		List<Disquera> lstDisqueras = this.disqueraDAO.consulta();
		
		
		lstDisqueras.forEach(disquera -> {
			System.out.println("Disquera : " + disquera.getDescripcion());
		});
		
		assertTrue(lstDisqueras.size() > 0 );
				
	}

	/**
	 * Test method for {@link com.rbsoft.project_jpa.dao.impl.DisqueraDAOImpl#consultaById(java.lang.Long)}.
	 */
	@Test
	void testConsultaById() {
		Disquera objDisquera = this.disqueraDAO.consultaById(1L);
		
		assertNotNull(objDisquera);
		
		System.out.println("Descripcion desquera : " + objDisquera.getDescripcion());
	}
	
	@Test
	void testConsultaByDescripcionJPQL() {
		
		Disquera objDisquera = this.disqueraDAO.consultaByDescripcionJPQL("Rbsoft Company");
		
		assertNotNull(objDisquera);
		
		System.out.println("Disquera consultada por Descripcion: " + objDisquera.getDescripcion() + " " + objDisquera.getIdDisquera() );
	}

	@Test
	void testConsultaByDescripcionNative() {
		
		
		Disquera objDisquera = this.disqueraDAO.consultaByDescripcionNative("Rbsoft Company");
		
		assertNotNull(objDisquera);
		
		System.out.println("Disquera consultada por Descripcion: " + objDisquera.getDescripcion() + " " + objDisquera.getIdDisquera() );
		
		Genero gen = new Genero();
		
		

	
		
	}
}
