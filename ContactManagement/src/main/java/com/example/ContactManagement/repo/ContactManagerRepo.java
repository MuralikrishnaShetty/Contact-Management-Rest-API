package com.example.ContactManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ContactManagement.entity.*;

public interface ContactManagerRepo extends JpaRepository<Contact,Integer>{

}
