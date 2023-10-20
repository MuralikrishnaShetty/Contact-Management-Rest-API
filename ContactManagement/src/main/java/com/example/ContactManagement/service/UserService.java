package com.example.ContactManagement.service;

//import java.lang.foreign.Linker.Option;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContactManagement.entity.User;
import com.example.ContactManagement.exception.NotFound;
import com.example.ContactManagement.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo urepo;

	public User addUser(User user) {
		return urepo.save(user);

	}

	public User getByUsername(String userName) throws NotFound{
		User op = urepo.getByUserName(userName);
		return op;
	}
	
	
	 

}
