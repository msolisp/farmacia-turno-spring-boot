package com.springboot.consorcio.apirest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FarmaciaServiceImpl implements IFarmaciaService {

	private static RestTemplate restTemplateFarmacias = new RestTemplate();
	private static final String GET_FARMACIAS_ENDPOINT_URL = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";

	@Override
	public String getFarmacias() {
		String resultado = restTemplateFarmacias.getForObject(GET_FARMACIAS_ENDPOINT_URL, String.class);
		return resultado;
	}

}
