package com.Exercise.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class exercise {

	@Id
	private String id;
	private String imageurl;
	private String name;
	private String shortdesc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortdesc() {
		return shortdesc;
	}
	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}
	public exercise(String id, String imageurl, String name, String shortdesc) {
		super();
		this.id = id;
		this.imageurl = imageurl;
		this.name = name;
		this.shortdesc = shortdesc;
	}
	public exercise() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "exercise [id=" + id + ", imageurl=" + imageurl + ", name=" + name + ", shortdesc=" + shortdesc + "]";
	}
	
}
