package org.dao;

import org.model.Login;
import org.model.User;

public interface UserDao {

	  void register(User user);
	  User validateUser(Login login);
}
