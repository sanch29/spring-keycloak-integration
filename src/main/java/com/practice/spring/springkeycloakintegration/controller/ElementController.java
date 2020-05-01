package com.practice.spring.springkeycloakintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.spring.springkeycloakintegration.model.Element;
import com.practice.spring.springkeycloakintegration.service.ElementService;

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
