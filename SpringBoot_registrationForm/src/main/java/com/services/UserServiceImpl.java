package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Users;
import com.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public String addUser(Users user) {
		Users use = userRepo.save(user);
		return "registration successfully done";
	}

	@Override
	public List<Users> getUsers() {
		
		return null;
	}

}
