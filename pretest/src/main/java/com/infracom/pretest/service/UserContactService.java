package com.infracom.pretest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infracom.pretest.Entity.UserContact;
import com.infracom.pretest.model.ContactListModel;
import com.infracom.pretest.repo.UserContactRepo;


@Service
public class UserContactService {

	@Autowired UserContactRepo userContactRepo;
	
	//get All User Contact
	public List<ContactListModel> getAllUserContact(){
		return userContactRepo.findAllUserContact();
	}
	
	//get user contact by id
	public List<ContactListModel> getUserContactById(String id){
		return userContactRepo.findUserContactById(id);
	}
	
	//get user contact by address
	public List<ContactListModel> getUserContactByAddress(String address){
		return userContactRepo.findUserContactByAddress(address);
	}
	
	//get user contact by address
	public List<ContactListModel> getUserContactByUserId(String user_id){
		return userContactRepo.findUserContactByUserId(user_id);
	}
	
}
