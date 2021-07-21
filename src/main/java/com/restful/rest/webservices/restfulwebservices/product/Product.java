package com.restful.rest.webservices.restfulwebservices.product;

import java.util.Date;
import java.util.List;

public class Product {
	private Integer id;
	private String status;
	public List<List> list;
	private Date createdAt;
	private Date expiresOn;
	
	public Product(Integer id, String status, Date createdAt, Date expiresOn) {
		super();
		this.id = id;
		this.status = status;
		this.createdAt = createdAt;
		this.expiresOn = expiresOn;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getExpiresOn() {
		return expiresOn;
	}
	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}
	
}
