package com.springboot.consorcio.apirest.model;

import java.io.Serializable;

public class Farmacia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2627271535260079086L;

	private String fk_comuna;
	private String localNombre;
	private String comunaNombre;
	private String localDireccion;

	public Farmacia(String fk_comuna, String localNombre, String comunaNombre, String localDireccion) {
		super();
		this.fk_comuna = fk_comuna;
		this.localNombre = localNombre;
		this.comunaNombre = comunaNombre;
		this.localDireccion = localDireccion;
	}

	public Farmacia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFk_comuna() {
		return fk_comuna;
	}

	public void setFk_comuna(String fk_comuna) {
		this.fk_comuna = fk_comuna;
	}

	public String getLocalNombre() {
		return localNombre;
	}

	public void setLocalNombre(String localNombre) {
		this.localNombre = localNombre;
	}

	public String getComunaNombre() {
		return comunaNombre;
	}

	public void setComunaNombre(String comunaNombre) {
		this.comunaNombre = comunaNombre;
	}

	public String getLocalDireccion() {
		return localDireccion;
	}

	public void setLocalDireccion(String localDireccion) {
		this.localDireccion = localDireccion;
	}

	@Override
	public String toString() {
		return "Farmacia [fk_comuna=" + fk_comuna + ", localNombre=" + localNombre + ", comunaNombre=" + comunaNombre
				+ ", localDireccion=" + localDireccion + "]";
	}

}
