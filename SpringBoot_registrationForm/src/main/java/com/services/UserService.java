package com.services;

import java.util.List;

import com.entity.Users;

public interface UserService {
	
	String addUser(Users user);
	
	List<Users> getUsers();

}
