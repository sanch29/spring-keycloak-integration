package com.practice.spring.springkeycloakintegration.service;

import org.springframework.http.ResponseEntity;

import com.practice.spring.springkeycloakintegration.model.Element;

public interface ElementService {
	
	ResponseEntity<Element> getElement(String elementId);
}
