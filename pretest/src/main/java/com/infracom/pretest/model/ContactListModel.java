package com.infracom.pretest.model;

public class ContactListModel {
	
	private String id;
	private String address;
	private String user_id;
	
	public ContactListModel() {
		
	}
	
	public ContactListModel(String id, String address, String user_id) {
		this.id = id;
		this.address = address;
		this.user_id = user_id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
