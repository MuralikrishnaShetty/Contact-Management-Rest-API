package com.example.ContactManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactManagement.entity.Address;
import com.example.ContactManagement.service.AddressService;

@RestController
@RequestMapping("/ContactManagement.example.com")
public class AddressControll {
	@Autowired
	AddressService ads;
	
	@PostMapping("/address")
	public ResponseEntity<Address> addAddres(@RequestBody Address adds){
		Address ad=ads.addAddres(adds);
		return  new ResponseEntity<>(ad,HttpStatus.CREATED);
	}

}
