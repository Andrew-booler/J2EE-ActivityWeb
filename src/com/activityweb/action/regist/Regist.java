package com.activityweb.action.regist;

import com.activityweb.dao.common.UserDao;
import com.activityweb.dao.common.impl.UserDaoImpl;
import com.activityweb.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class Regist extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4439914367745321519L;
	private User user;
	private UserDao userDao;
	private String username;
	private String password;
	private String password_again;
	private String email;
	private String showname;
	public Regist(){
		super();
		user=new User();
		userDao=new UserDaoImpl();
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

	public String execute() throws Exception{
		if(username.isEmpty()){
			super.addFieldError("username", "请输入用户名！");
			return ERROR;
		}
		if(password.isEmpty()){
			super.addFieldError("password", "请输入密码！");
			return ERROR;
		}
		if(!password.equals(password_again)){
			super.addFieldError("password_again", "两次输入的密码不一致！");
			return ERROR;
		}
		if(showname.isEmpty()){
			super.addFieldError("showname", "请输入昵称！");
			return ERROR;
		}
		if(userDao.validateUsername(username))
		{
			super.addFieldError("username", "用户名已存在！");
			return ERROR;
		}
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		user.setShowname(showname);
		user.setId(userDao.addUser(user));
		if(null==user.getId())
		{
			super.addFieldError("username", "注册失败");
			return ERROR;
		}
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword_again() {
		return password_again;
	}
	public void setPassword_again(String password_again) {
		this.password_again = password_again;
	}
	public String getShowname() {
		return showname;
	}
	public void setShowname(String showname) {
		this.showname = showname;
	}
}
