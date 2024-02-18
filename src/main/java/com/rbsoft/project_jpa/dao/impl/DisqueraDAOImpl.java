/**
 * 
 */
package com.rbsoft.project_jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.rbsoft.project_jpa.dao.DisqueraDAO;
import com.rbsoft.project_jpa.entity.Disquera;

/**
 * @author RBSOFT Clase que implementa las transacciones para la tabla Disquera
 *
 */
public class DisqueraDAOImpl implements DisqueraDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("PersistenceUnitProyectJpa");

	@Override
	public void guardar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		try {
			em.persist(disquera);
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
	public void actualizar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		try {
			em.merge(disquera);
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
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera objDisquera = em.find(Disquera.class, id);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.remove(objDisquera);
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
	public List<Disquera> consulta() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		StringBuilder query = new StringBuilder(); 
		
		query.append(" FROM Disquera ");
		query.append(" ORDER BY descripcion ");
		
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) em.createQuery(query.toString());
				
		return queryDisquera.getResultList();
	}

	@Override
	public Disquera consultaById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		if (disqueraConsultada.equals(null)) {
			throw new EntityNotFoundException("La Disquera con el id " + id + "no fue encontrada");
		}
		
		return disqueraConsultada;
	}

}
