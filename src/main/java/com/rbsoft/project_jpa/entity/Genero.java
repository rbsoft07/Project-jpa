/**
 * 
 */
package com.rbsoft.project_jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author RBSOFT
 * Clase para representar los generos de musica
 */
@Entity
@Table(name = "genero")
@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
public class Genero {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "IdGenero")
	private Long idGenero;
	
	@Column(name = "descripcion")
	private String descripcion; 
	
	@Column(name= "fechaCreacion")
	private LocalDateTime fechaCreacion; 

	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus")
	private boolean estatus; 
}
