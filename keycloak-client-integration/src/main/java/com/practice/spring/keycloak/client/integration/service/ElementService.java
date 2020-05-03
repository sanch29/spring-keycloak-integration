package com.practice.spring.keycloak.client.integration.service;

import org.springframework.http.ResponseEntity;

import com.practice.spring.keycloak.client.integration.model.Element;

public interface ElementService {
	
	ResponseEntity<Element> getElement(String elementId);
}
