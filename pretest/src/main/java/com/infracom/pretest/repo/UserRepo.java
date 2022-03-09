package com.infracom.pretest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infracom.pretest.Entity.User;
import com.infracom.pretest.model.UserContactModel;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	@Query("SELECT new com.infracom.pretest.model.UserContactModel(u.id , u.name, u.age, d.address) "
			+ "From User u JOIN u.userContacts d")
	public List<UserContactModel> findAllUserJoinedWithContact();
	
	@Query("SELECT new com.infracom.pretest.model.UserContactModel(u.id , u.name, u.age, d.address) "
			+ "From User u JOIN u.userContacts d "
			+ "WHERE u.id=?1")
	public List<UserContactModel> findAllUserJoinedWithContactById(String id);
	
	@Query("SELECT new com.infracom.pretest.model.UserContactModel(u.id , u.name, u.age, d.address) "
			+ "From User u JOIN u.userContacts d "
			+ "WHERE u.name LIKE %?1%")
	public List<UserContactModel> findAllUserJoinedWithContactByName(String name);
	
	@Query("SELECT new com.infracom.pretest.model.UserContactModel(u.id , u.name, u.age, d.address) "
			+ "From User u JOIN u.userContacts d "
			+ "WHERE u.age=?1")
	public List<UserContactModel> findAllUserJoinedWithContactByAge(Integer age);
	
	@Query("SELECT new com.infracom.pretest.model.UserContactModel(u.id , u.name, u.age, d.address) "
			+ "From User u JOIN u.userContacts d "
			+ "WHERE d.address LIKE %?1%")
	public List<UserContactModel> findAllUserJoinedWithContactByAddress(String address);

}
