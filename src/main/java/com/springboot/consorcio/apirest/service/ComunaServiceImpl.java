package com.springboot.consorcio.apirest.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.springboot.consorcio.apirest.model.Comuna;
import com.springboot.consorcio.apirest.model.ComunaBO;

@Service
public class ComunaServiceImpl implements IComunaService {

	private static RestTemplate restTemplateComunas = new RestTemplate();
	private static final String POST_COMUNAS_ENDPOINT_URL = "https://midastest.minsal.cl/farmacias/maps/index.php/utilidades/maps_obtener_comunas_por_regiones";

	// objeto business object Comuna
	ComunaBO comunaBusinessObject = new ComunaBO();

	public String getComunas(String p_reg_id) {

		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("reg_id", p_reg_id);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<>(map, headers);

		ResponseEntity<String> resultado = restTemplateComunas.exchange(POST_COMUNAS_ENDPOINT_URL, HttpMethod.POST,
				requestEntity, String.class);
		return resultado.getBody();

	}

	@Override
	public List<Comuna> getAllComunas() {
		return comunaBusinessObject.getComunas();
	}

}
