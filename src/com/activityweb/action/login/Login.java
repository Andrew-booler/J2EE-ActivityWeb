package com.activityweb.action.login;

import com.activityweb.dao.common.UserDao;
import com.activityweb.dao.common.impl.UserDaoImpl;
import com.activityweb.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class Login extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4543686407480617730L;
	private String username;
	private String password;
	private User user;
	private UserDao userDao;
	private HttpServletRequest request;
	
	public Login() {
		super();
		request=ServletActionContext.getRequest();
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
	public String regist() throws Exception{
		request.setAttribute("status", "component/content.jsp");
		return INPUT;
	}
	public String execute() throws Exception{
		if(username.isEmpty()){
			super.addFieldError("username", "请输入用户名！");
			request.setAttribute("status", "component/content.jsp");
			return ERROR;
		}
		if(password.isEmpty()){
			super.addFieldError("password", "请输入密码！");
			request.setAttribute("status", "component/content.jsp");
			return ERROR;
		}
		if(!userDao.validateUsername(username))
		{
			super.addFieldError("username", "用户不存在！");
			request.setAttribute("status", "component/content.jsp");
			return ERROR;
		}
		user=userDao.validateUser(username, password);
		if(null==user)
		{
			super.addFieldError("password", "密码不正确！");
			request.setAttribute("status", "component/content.jsp");
			return ERROR;
		}
		request.setAttribute("status", "component/content.jsp");
		request.setAttribute("userid", user.getId());
		return SUCCESS;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}



}
