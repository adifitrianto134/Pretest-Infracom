package com.infracom.pretest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infracom.pretest.Entity.User;
import com.infracom.pretest.model.UserContactModel;
import com.infracom.pretest.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired UserRepo userRepo;
	
//	public void saveUser(User user) {
//	userRepo.save(user);
//}
	
	//get All User
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	//get All User Joined With Contact
	public List<UserContactModel> getAllUserJoined(){
		return userRepo.findAllUserJoinedWithContact();
	}
	
	public List<UserContactModel> getAllUserJoinedById(String id){
		return userRepo.findAllUserJoinedWithContactById(id);
	}
	
	public List<UserContactModel> getAllUserJoinedByName(String name){
		return userRepo.findAllUserJoinedWithContactByName(name);
	}
	
	public List<UserContactModel> getAllUserJoinedByAge(Integer age){
		return userRepo.findAllUserJoinedWithContactByAge(age);
	}
	
	public List<UserContactModel> getAllUserJoinedByAddress(String address){
		return userRepo.findAllUserJoinedWithContactByAddress(address);
	}
	
}
