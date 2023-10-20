package com.example.ContactManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContactManagement.entity.Contact;
import com.example.ContactManagement.repo.ContactManagerRepo;

@Service
public class ContactService {
	@Autowired
	ContactManagerRepo cmrepo;

	public Contact addContact(Contact contact) {
		return cmrepo.save(contact);
	}

}
