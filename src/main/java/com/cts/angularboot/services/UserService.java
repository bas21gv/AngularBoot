package com.cts.angularboot.services;

import java.util.List;

import com.cts.angularboot.pojo.User;

public interface UserService {

	void saveUser(User user);
	void updateUser(User user);
	List<User> findAllUsers();
}
