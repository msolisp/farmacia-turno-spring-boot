package com.springboot.consorcio.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.consorcio.apirest.model.Comuna;
import com.springboot.consorcio.apirest.service.IComunaService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api")
public class ComunaController {

	@Autowired
	private IComunaService comunaService;

	@PostMapping(value = "/comunas/{reg_id}")
	public String getComunas(@PathVariable("reg_id") String p_reg_id) {

		String comunas = comunaService.getComunas(p_reg_id);
		return comunas;

	}

	@GetMapping(value = "/comunas")
	public List<Comuna> getAllComunas() {
		List<Comuna> comunas = comunaService.getAllComunas();
		return comunas;

	}

}
