package com.user.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Entity.User;
import com.user.Service.ServiceInterface;

@RestController
public class UserController 
{
	@Autowired
	ServiceInterface serRepo;
	
	@PostMapping("/save")
	public User userSave(@RequestBody User user) 
	{
		return serRepo.userSave(user);
	}
	
	
}
