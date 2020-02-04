package com.springboot.consorcio.apirest.model;

import java.io.Serializable;

public class Comuna implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2721001743497988763L;
	private String reg_id;
	private String value;
	private String nombre;

	public Comuna(String reg_id, String value, String nombre) {
		super();
		this.reg_id = reg_id;
		this.value = value;
		this.nombre = nombre;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
