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
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter 
//@Setter
public class Genero {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "idGenero")
	private Long idGenero;
	
	@Column(name = "descripcion")
	private String descripcion; 
	
	@Column(name= "fechaCreacion")
	private LocalDateTime fechaCreacion; 

	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus")
	private boolean estatus;
	
	
	/**
	 * @constructor sin parametros
	 */
	public Genero() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param idGenero
	 * @param descripcion
	 * @param fechaCreacion
	 * @param fechaModificacion
	 * @param estatus
	 */
	public Genero(Long idGenero, String descripcion, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion,
			boolean estatus) {
		this.idGenero = idGenero;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estatus = estatus;
	}



	/**
	 * @return the idGenero
	 */
	public Long getIdGenero() {
		return idGenero;
	}

	/**
	 * @param idGenero the idGenero to set
	 */
	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
