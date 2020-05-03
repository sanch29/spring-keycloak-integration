package com.practice.spring.keycloak.client.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.spring.keycloak.client.integration.model.Element;
import com.practice.spring.keycloak.client.integration.service.ElementService;

@Controller
public class ElementController {
	
	@Autowired
	private ElementService elementService;
	
	@GetMapping("/element/{id}")
	public ResponseEntity<Element> getElement(@PathVariable("id") String id) {
		ResponseEntity<Element> response = elementService.getElement(id);
		return response;
	}
}
