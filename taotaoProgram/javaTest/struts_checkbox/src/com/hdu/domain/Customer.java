package com.hdu.domain;

import java.io.Serializable;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Customer implements Serializable {
	private String name;
	private String password;
	private boolean married;
	private String hobby;
	private String city;
	private String description;
	private  String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + ", married=" + married + ", hobby=" + hobby
				+ ", city=" + city + ", description=" + description + ", gender=" + gender + "]";
	}
	
}
