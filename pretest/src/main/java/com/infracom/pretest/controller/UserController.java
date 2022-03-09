package com.infracom.pretest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.infracom.pretest.Entity.UserContact;
import com.infracom.pretest.model.ContactListModel;
import com.infracom.pretest.model.UserContactModel;
import com.infracom.pretest.service.UserContactService;
import com.infracom.pretest.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	@Autowired UserContactService userContactService;
	
	//REST api for get user
	@GetMapping("/GetAllUsers")
	public List<UserContactModel> getAllUsersJoined(){
		return userService.getAllUserJoined();
	}
	
	@GetMapping("/GetUserById/{id}")
	public List<UserContactModel> getAllUsersJoinedById(@PathVariable String id){
		return userService.getAllUserJoinedById(id);
	}
	
	@GetMapping("/GetUserByName/{name}")
	public List<UserContactModel> getAllUsersJoinedByName(@PathVariable String name){
		return userService.getAllUserJoinedByName(name);
	}
	
	@GetMapping("/GetUserByAge/{age}")
	public List<UserContactModel> getAllUsersJoinedByAge(@PathVariable Integer age){
		return userService.getAllUserJoinedByAge(age);
	}
	
	@GetMapping("/GetUserByAddress/{address}")
	public List<UserContactModel> getAllUsersJoinedByAddress(@PathVariable String address){
		return userService.getAllUserJoinedByAddress(address);
	}
	
	
	//REST api for get userContact
	@GetMapping("/GetAllUserContact")
	public List<ContactListModel> getAllUserContact(){
		return userContactService.getAllUserContact();
	}
	
	@GetMapping("/GetUserContactById/{id}")
	public List<ContactListModel> getUserContactById(@PathVariable String id){
		return userContactService.getUserContactById(id);
	}
	
	@GetMapping("/GetUserContactByAddress/{address}")
	public List<ContactListModel> getUserContactByAddress(@PathVariable String address){
		return userContactService.getUserContactByAddress(address);
	}
	
	@GetMapping("/GetUserContactByUser_id/{user_id}")
	public List<ContactListModel> getUserContactByUser_id(@PathVariable String user_id){
		return userContactService.getUserContactByUserId(user_id);
	}
}
