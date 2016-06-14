package com.activityweb.dao.common.impl;

import java.util.List;
import com.activityweb.connector.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.entity.Record;


public class RecordDaoImpl implements RecordDao {
	@Override
	public Connection getConnection(){
		return Connector.getConnector().getconntion();
	}
	
	@Override
	public Record getRecordById(String id) {
        try {
			PreparedStatement stat=getConnection().prepareStatement("SELECT * FROM RECORDS WHERE ID=?");
			stat.setString(1,id);
			ResultSet SQLres=stat.executeQuery();
			Record res=new Record();
			SQLres.next();
			res.setAmount(SQLres.getDouble("AMOUNT"));
			res.setId(SQLres.getString("ID"));
			res.setIo(SQLres.getInt("IO"));
			res.setNote(SQLres.getString("NOTE"));
			res.setOccurence(SQLres.getDate("OCCURENCE"));
			stat.close();
			SQLres.close();
			return res;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
        
    }




    


}
