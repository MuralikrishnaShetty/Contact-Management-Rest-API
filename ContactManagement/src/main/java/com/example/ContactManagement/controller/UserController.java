package com.example.ContactManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactManagement.entity.User;
import com.example.ContactManagement.exception.NotFound;
import com.example.ContactManagement.service.UserService;

@RestController
@RequestMapping("/ContactManagement.example.com")
public class UserController {
	@Autowired
	UserService us;
	
	@PostMapping("/user")
	public ResponseEntity<User>addUser(@RequestBody User user){
		User ad= us.addUser(user);
		return new  ResponseEntity<>(ad,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/user/{UserName}")
	public ResponseEntity<User>getByUsername(@PathVariable String userName) throws NotFound{
		User ee=us.getByUsername(userName);
		if(ee!=null) {
			return new ResponseEntity<>(ee,HttpStatus.OK);
		}else {
			throw new NotFound();
		}
		
	}
	

}
