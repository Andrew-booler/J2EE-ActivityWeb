package com.activityweb.dao.common.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.activityweb.connector.Connector;
import com.activityweb.dao.common.UserDao;

public class UserDaoImpl implements UserDao {
	private Connection connection;
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return Connector.getConnector().getconntion();
	}

	@Override
	public String validateUser(String username,String password) {
		// TODO Auto-generated method stub
		String sqlComm="SELECT * FROM RECORDS WHERE USERNAME=? AND PASSWORD=?";
		try {
			PreparedStatement stat=connection.prepareStatement(sqlComm);
			stat.setString(1,username);
			stat.setString(2,password);
			ResultSet SQLres=stat.executeQuery();
			SQLres.last();
			if(-1!=SQLres.getRow()){
				return SQLres.getString("ID");
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

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
