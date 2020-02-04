package com.springboot.consorcio.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.consorcio.apirest.service.IFarmaciaService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api")
public class FarmaciaController {

	@Autowired
	private IFarmaciaService farmaciaService;

	@GetMapping(path = "/farmacias")
	public String getFarmacias() {

		String resultado = farmaciaService.getFarmacias();
		return resultado;

	}

}
