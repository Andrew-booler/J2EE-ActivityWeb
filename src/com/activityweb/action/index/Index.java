package com.activityweb.action.index;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Index  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2349650867026102325L;
	private HttpServletRequest request;
	public String execute() throws Exception{
		request=ServletActionContext.getRequest();
		request.setAttribute("status", "component/content.jsp");
		return SUCCESS;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
}
