package com.rbsoft.project_jpa.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionMusicalShop {
	
	private static final EntityManagerFactory emf = buildEntityManagerFactory();
	
	
	
	public ConexionMusicalShop() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static EntityManagerFactory buildEntityManagerFactory() {
		 return Persistence
			.createEntityManagerFactory("PersistenceUnitProyectJpa");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	

}
