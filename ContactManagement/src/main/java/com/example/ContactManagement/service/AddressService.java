package com.example.ContactManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContactManagement.entity.Address;
import com.example.ContactManagement.repo.AddresRepo;

@Service
public class AddressService {
	@Autowired
	AddresRepo arepo;
	
	public Address addAddres(Address adds) {
		return arepo.save(adds);
	}
	

	
	
}
