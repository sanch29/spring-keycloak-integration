package com.practice.spring.springkeycloakintegration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.spring.springkeycloakintegration.model.Element;

@Configuration
public class AppConfig {
	
	@Bean
	public Element element() {
		Element element = new Element("1", "hydrogen");
		return element;
	}
}
