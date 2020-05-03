package com.practice.spring.keycloak.client.integration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.spring.keycloak.client.integration.model.Element;

@Configuration
public class AppConfig {
	
	@Bean
	public Element element() {
		Element element = new Element("1", "hydrogen");
		return element;
	}
}
