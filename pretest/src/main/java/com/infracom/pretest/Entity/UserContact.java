package com.infracom.pretest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserContact {
	
	@Id
	private String id;
	private String address;
	
	@ManyToOne
	private User user;
	
	public UserContact() {
		
	}

	public UserContact(String id, String address, User user) {
		this.id = id;
		this.address = address;
		this.user = user;
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
}
