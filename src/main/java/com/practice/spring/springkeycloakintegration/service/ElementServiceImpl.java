package com.practice.spring.springkeycloakintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.spring.springkeycloakintegration.model.Element;

@Service
public class ElementServiceImpl implements ElementService {

	@Autowired
	private Element element;

	@Override
	public ResponseEntity<Element> getElement(String elementId) {
		
		return new ResponseEntity<>(element, HttpStatus.OK);
	}

}
