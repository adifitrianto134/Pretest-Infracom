package com.infracom.pretest.model;

public class UserContactModel {
	
	private String user_id;
	private String name;
	private Integer age;
	private String address;
	
	
	public UserContactModel(String user_id, String name, Integer age, String address) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
