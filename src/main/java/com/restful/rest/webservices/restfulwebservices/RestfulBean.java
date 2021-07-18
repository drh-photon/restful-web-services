package com.restful.rest.webservices.restfulwebservices;

public class RestfulBean {
	private String message;
	public RestfulBean(String message){
		this.setMessage(message);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "RestfulBean [message=" + message + "]";
	}
	
}
