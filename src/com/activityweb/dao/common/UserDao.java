package com.activityweb.dao.common;

import java.sql.Connection;
import com.activityweb.entity.User;

public interface UserDao {
	public abstract String validateUser(String username,String password);
}
