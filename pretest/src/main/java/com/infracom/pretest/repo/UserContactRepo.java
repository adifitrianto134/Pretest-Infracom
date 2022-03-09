package com.infracom.pretest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infracom.pretest.Entity.UserContact;
import com.infracom.pretest.model.ContactListModel;
import com.infracom.pretest.model.UserContactModel;

public interface UserContactRepo extends JpaRepository<UserContact, Integer>{
	
	@Query("SELECT new com.infracom.pretest.model.ContactListModel(u.id , u.address, s.id) "
			+ "From UserContact u JOIN u.user s")
	public List<ContactListModel> findAllUserContact();
	
	@Query("SELECT new com.infracom.pretest.model.ContactListModel(u.id , u.address, s.id) "
			+ "From UserContact u JOIN u.user s "
			+ "WHERE u.id LIKE %?1%")
	public List<ContactListModel> findUserContactById(String id);
	
	@Query("SELECT new com.infracom.pretest.model.ContactListModel(u.id , u.address, s.id) "
			+ "From UserContact u JOIN u.user s "
			+ "WHERE u.address LIKE %?1%")
	public List<ContactListModel> findUserContactByAddress(String address);
	
	@Query("SELECT new com.infracom.pretest.model.ContactListModel(u.id , u.address, s.id) "
			+ "From UserContact u JOIN u.user s "
			+ "WHERE s.id LIKE %?1%")
	public List<ContactListModel> findUserContactByUserId(String user_id);
}
