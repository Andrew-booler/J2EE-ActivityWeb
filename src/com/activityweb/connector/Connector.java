package com.activityweb.connector;


import java.sql.*;

public class Connector {
	private String DBDriver="com.mysql.jdbc.Driver";
	private String DBURL="jdbc:mysql://localhost/activityweb";
	private String username="root";
	private String password="root";
	private Connection conntion=null;
	private static Connector connor=null;
	
	public static Connector getConnector(){
		if(null==connor){
			connor=new Connector();
		}
		return connor;
	}
	
	protected Connector() {
		try{
			Class.forName(DBDriver);
			System.out.println("Success loading DB Driver.");
			conntion = DriverManager.getConnection(DBURL,username,password);
			System.out.println("Success connecting Database.");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public Connection getconntion(){
		return conntion;
	}
}
