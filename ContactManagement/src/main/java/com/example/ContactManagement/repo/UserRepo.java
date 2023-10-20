package com.example.ContactManagement.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ContactManagement.entity.User;
//import com.example.ContactManagement.service.optional;

public interface UserRepo extends JpaRepository<User,Integer> {

	User getByUserName(String userName);

}
