package com.restful.rest.webservices.restfulwebservices;

import java.util.Date;
import java.util.List;

public class Product {
	private String id;
	private String status;
	public List<List> list;
	private Date createdAt;
	private Date expiresOn;
	
	public Product(String id, String status, List<List> list, Date createdAt, Date expiresOn) {
		super();
		this.id = id;
		this.status = status;
		this.list = list;
		this.createdAt = createdAt;
		this.expiresOn = expiresOn;
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<List> getList() {
		return list;
	}
	public void setList(List<List> list) {
		this.list = list;
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
