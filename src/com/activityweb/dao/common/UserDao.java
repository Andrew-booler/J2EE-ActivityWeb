package com.activityweb.dao.common;

import com.activityweb.entity.User;

public interface UserDao {
	public abstract User getUserById(String id);
	public abstract User validateUser(String username,String password);
	public abstract boolean validateUsername(String username);
}
