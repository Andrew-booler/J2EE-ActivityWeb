package com.activityweb.action.login;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4543686407480617730L;
	private String username;
	private String password;
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
		if(!username.equals("admin"))
		{
			super.addFieldError("username", "用户不存在！");
			return ERROR;
		}
		if(!password.equals("admin"))
		{
			super.addFieldError("password", "密码不正确！");
			return ERROR;
		}
		return SUCCESS;
	}
	
	public void validate(){
		if((null==username)||(0==username.length())){
			super.addActionError("用户名不能为空");
		}
		if((null==password)||(0==password.length())){
			super.addActionError("密码不能为空");
		}
	}

}
