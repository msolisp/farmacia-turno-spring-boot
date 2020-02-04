package com.springboot.consorcio.apirest.service;

import java.util.List;

import com.springboot.consorcio.apirest.model.Comuna;

/**
 * @author maximiliano
 *
 */
public interface IComunaService {

	/**
	 * @author maximiliano
	 *
	 */
	public String getComunas(String reg_id);

	public List<Comuna> getAllComunas();

}
