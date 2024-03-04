/**
 * 
 */
package com.rbsoft.project_jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rbsoft.project_jpa.dao.SubGeneroDAO;
import com.rbsoft.project_jpa.entity.SubGenero;

/**
 * @author RBSOFT
 * Clase que implementa el CRUD de la interface SubGeneroDAO
 */
public class SubGeneroDAOImpl implements SubGeneroDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("PersistenceUnitProyectJpa");
	
	
	/**
	 * Metodo que permite realizar el guardado del subGenero 
	 * @param subGenero {@link SubGenero}
	 * */
	@Override
	public void guardar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(subGenero);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			em.close();
			
		}

		
	}

	/**
	 * Metodo para relizar la actulizacion de los subGeneros musicales 
	 * @param subGenero {@link SubGenero}
	 * */
	@Override
	public void actualizar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.merge(subGenero);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			em.close();
			
		}
		
	}

	@Override
	public void eliminar(Long idSubGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		SubGenero objSubGeneroConsultado = em.find(SubGenero.class, idSubGenero);
		
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.remove(objSubGeneroConsultado);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			em.close();	
		}
	}

	@Override
	public List<SubGenero> consulta() {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		
		TypedQuery<SubGenero> query = em.createQuery("FROM SubGenero ORDER BY descripcion",SubGenero.class);
		
		
		return query.getResultList();
	}

	
	/**
	 * Metodo para realizar la busqueda de los subGeneros por id
	 * @param idSubGenero {@link SubGenero}
	 * */
	@Override
	public SubGenero consultarById(Long idSubGenero) {
		StringBuilder sqlQuery = new StringBuilder();
		SubGenero objResultSubGenero = new SubGenero();
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		
		/* AL CONSULTAR PARA ACTULIZAR NO AFECTA SU TABLA RELACIONADA , 
		 * SE TENDRIA QUE CONSULTAR POR SEPARADO PARA ACTULIZAR. 
		sqlQuery.append("SELECT g FROM SubGenero  g WHERE idSubGenero = :idSubGenero ORDER BY descripcion desc");
		
		TypedQuery<SubGenero> objQuerySubGenero = em.createQuery(sqlQuery.toString(), SubGenero.class);
		
		objQuerySubGenero.setParameter("idSubGenero", idSubGenero);
		
		
		List<SubGenero> lstSubGenero = objQuerySubGenero.getResultList();
		
		for (SubGenero objSubGenero : lstSubGenero) {
			objResultSubGenero =  objSubGenero;
		}
		return objResultSubGenero;
		*/
		return em.find(SubGenero.class, idSubGenero);
		
	}

}
