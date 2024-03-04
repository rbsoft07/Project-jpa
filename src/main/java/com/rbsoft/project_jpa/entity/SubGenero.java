/**
 * 
 */
package com.rbsoft.project_jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ManyToAny;

/**
 * Clase que reprensenta los subGeneros musicales registrado
 * @author RBSOFT 
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "idGenero")
//	@Cascade(CascadeType.PERSIST)//video 
//	@Cascade(CascadeType.MERGE)//video 100
	@Cascade(CascadeType.REMOVE)//video 101
	private Genero genero; 
	
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
	public SubGenero(Long idSubGenenero, String descripcion, Genero genero, LocalDateTime fechaCreacion,
			LocalDateTime fechaModificacion, boolean estatus) {
		super();
		this.idSubGenenero = idSubGenenero;
		this.descripcion = descripcion;
		this.genero = genero;
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
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
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
