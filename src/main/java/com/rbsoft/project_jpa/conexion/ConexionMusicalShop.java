package com.rbsoft.project_jpa.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionMusicalShop {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("PersistenceUnitProyectJpa");
	
	public static EntityManagerFactory emf;
	
	
	public ConexionMusicalShop() {
		// TODO Auto-generated constructor stub
	}
	
	

}
