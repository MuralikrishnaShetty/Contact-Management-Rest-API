package com.example.ContactManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactManagement.entity.Contact;
import com.example.ContactManagement.service.ContactService;

@RestController
@RequestMapping("/ContactManagement.example.com")
public class ContactController {
	@Autowired
	ContactService cs;
	@PostMapping("/Contact")
	public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
		Contact cc=cs.addContact(contact);
		return new ResponseEntity<>(cc,HttpStatus.CREATED);
	}

}
