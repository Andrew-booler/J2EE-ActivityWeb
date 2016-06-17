package com.activityweb.dao.common.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.activityweb.connector.Connector;
import com.activityweb.dao.common.UserDao;
import com.activityweb.entity.User;

public class UserDaoImpl implements UserDao {

	private Connection getConnection() {
		// TODO Auto-generated method stub
		return Connector.getConnector().getconntion();
	}
	
	
	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		String sqlComm="SELECT * FROM USER WHERE Id=?";
		try {
			PreparedStatement stat=getConnection().prepareStatement(sqlComm);
			stat.setString(1,id);
			ResultSet SQLres=stat.executeQuery();
			SQLres.last();
			if(-1!=SQLres.getRow()){
				User user=new User();
				user.setShowname(SQLres.getString("SHOWNAME"));
				user.setEmail(SQLres.getString("EMAIL"));
				user.setId(id);
				return user;
			}else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public User validateUser(String username,String password) {
		// TODO Auto-generated method stub
		String sqlComm="SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=?";
		try {
			PreparedStatement stat=getConnection().prepareStatement(sqlComm);
			stat.setString(1,username);
			stat.setString(2,password);
			ResultSet SQLres=stat.executeQuery();
			SQLres.last();
			if(0<SQLres.getRow()){
				User user=new User();
				user.setShowname(SQLres.getString("SHOWNAME"));
				user.setEmail(SQLres.getString("EMAIL"));
				user.setId(SQLres.getString("ID"));
				return user;
			}else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
	}

	@Override
	public boolean validateUsername(String username) {
		// TODO Auto-generated method stub
		String sqlComm="SELECT * FROM USERS WHERE USERNAME=?";
		try {
			PreparedStatement stat=getConnection().prepareStatement(sqlComm);
			stat.setString(1,username);
			ResultSet SQLres=stat.executeQuery();
			SQLres.last();
			if(0<SQLres.getRow()){
				return true;
			}else
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		String sqlComm="INSERT INTO USERS (USERNAME,PASSWORD,EMAIL,SHOWNAME) VALUES (?,?,?,?)";
		String sqlComm1="SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=?";
		try {
			PreparedStatement stat=getConnection().prepareStatement(sqlComm);
			stat.setString(1,user.getUsername());
			stat.setString(2,user.getPassword());
			stat.setString(3, user.getEmail());
			stat.setString(4,user.getShowname());
			int SQLres=stat.executeUpdate();
			if(0<SQLres){
				PreparedStatement stat1=getConnection().prepareStatement(sqlComm1);
				stat1.setString(1,user.getUsername());
				stat1.setString(2,user.getPassword());
				ResultSet SQLres1=stat1.executeQuery();
				SQLres1.last();
				return SQLres1.getString("ID");
			}else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
	}



}
