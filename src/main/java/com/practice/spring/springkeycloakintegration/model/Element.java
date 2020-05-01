package com.practice.spring.springkeycloakintegration.model;

public class Element {
	private String elementId;
	private String elementName;

	public Element(String elementId, String elementName) {
		super();
		this.elementId = elementId;
		this.elementName = elementName;
	}

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	@Override
	public String toString() {
		return "Element [elementId=" + elementId + ", elementName=" + elementName + "]";
	}

}
