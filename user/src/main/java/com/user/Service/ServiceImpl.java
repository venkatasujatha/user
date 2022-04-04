package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Entity.User;
import com.user.dao.UserRepository;
@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
	UserRepository repositry;
	@Override
	public User userSave(User user) 
	{
		return repositry.save(user);
	}
	
}
