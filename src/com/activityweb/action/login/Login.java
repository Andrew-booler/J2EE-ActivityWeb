package com.activityweb.action.login;

import com.activityweb.dao.common.UserDao;
import com.activityweb.dao.common.impl.UserDaoImpl;
import com.activityweb.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4543686407480617730L;
	private String username;
	private String password;
	private User user;
	private UserDao userDao;
	public Login() {
		super();
		this.userDao = new UserDaoImpl();
		this.user=new User();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSubmit(String submit){
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setRecordDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public String execute() throws Exception{
		if(username.isEmpty()){
			super.addFieldError("username", "请输入用户名！");
			return ERROR;
		}
		if(password.isEmpty()){
			super.addFieldError("password", "请输入密码！");
			return ERROR;
		}
		if(!userDao.validateUsername(username))
		{
			super.addFieldError("username", "用户不存在！");
			return ERROR;
		}
		user=userDao.validateUser(username, password);
		if(user.getId().isEmpty())
		{
			super.addFieldError("password", "密码不正确！");
			return ERROR;
		}
		
		return SUCCESS;
	}
	

	
	public String jump() throws Exception{

		return SUCCESS;
	}



}
