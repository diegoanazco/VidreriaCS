package com.construccion.uls.model;

import java.util.Date;

public class Post {
	private int id;
	private Date fecha;
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Post(int id, Date fecha, String url) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.url = url;
	}
	public Post() {
		//super();
	}
	
	
}
