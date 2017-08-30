package org.service;

import org.dao.UserDaoImpl;
import org.model.Login;
import org.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	@Autowired
	  UserDaoImpl userDao;
	
	public void registerUser(User user)
	{
		userDao.register(user);
	}
	
	public User validateCredentials(Login login)
	{
		return userDao.validateUser(login);
	}
}
