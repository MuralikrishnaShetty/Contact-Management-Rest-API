package com.example.ContactManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ContactManagement.entity.Address;

public interface AddresRepo extends JpaRepository<Address,Integer>{

}
