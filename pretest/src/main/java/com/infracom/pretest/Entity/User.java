package com.infracom.pretest.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	private String id;
	private String name;
	private Integer age;
	
	@OneToMany(mappedBy = "user")
	private List<UserContact> userContacts;
	
	public User() {
		
	}
	
	public User(String id, String name, Integer age, List<UserContact> userContacts) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.userContacts = userContacts;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
}
