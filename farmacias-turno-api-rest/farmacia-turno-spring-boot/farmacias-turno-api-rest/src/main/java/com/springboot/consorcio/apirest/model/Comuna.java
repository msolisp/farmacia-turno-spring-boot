package com.springboot.consorcio.apirest.model;

public class Comuna {

	private String codigo;
	private String nombre;


	public Comuna() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comuna(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Comuna [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
