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

/**
 * @author RBSOFT
 *
 */
@Entity
@Table(name = "subgenero")
public class SubGenero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSubGenero")
	private Long idSubGenenero;
	
	@Column(name = "descripcion")
	private String descripcion; 
	
	@Column(name = "idGenero")
	private Long idGenero; 
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion; 
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion; 
	
	@Column(name = "estatus")
	private boolean estatus;

	
	public SubGenero() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param idSubGenenero
	 * @param descripcion
	 * @param idGenero
	 * @param fechaCreacion
	 * @param fechaModificacion
	 * @param estatus
	 */
	public SubGenero(Long idSubGenenero, String descripcion, Long idGenero, LocalDateTime fechaCreacion,
			LocalDateTime fechaModificacion, boolean estatus) {
		super();
		this.idSubGenenero = idSubGenenero;
		this.descripcion = descripcion;
		this.idGenero = idGenero;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.estatus = estatus;
	}

	/**
	 * @return the idSubGenenero
	 */
	public Long getIdSubGenenero() {
		return idSubGenenero;
	}

	/**
	 * @param idSubGenenero the idSubGenenero to set
	 */
	public void setIdSubGenenero(Long idSubGenenero) {
		this.idSubGenenero = idSubGenenero;
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
