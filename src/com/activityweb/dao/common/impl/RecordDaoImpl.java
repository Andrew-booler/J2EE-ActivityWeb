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
	
	private Record record;


	public Connection getConnection(){
		return Connector.getConnector().getconntion();
	}
	
	
	@Override
	public Record getRecordById(String id) {
        try {
			PreparedStatement stat=getConnection().prepareStatement("SELECT * FROM RECORDS WHERE ID=?");
			stat.setString(1,id);
			ResultSet SQLres=stat.executeQuery();
			SQLres.next();
			record=new Record();
			record.setAmount(SQLres.getDouble("AMOUNT"));
			record.setId(SQLres.getString("ID"));
			record.setIo(SQLres.getInt("IO"));
			record.setNote(SQLres.getString("NOTE"));
			record.setOccurence(SQLres.getDate("OCCURENCE"));
			stat.close();
			SQLres.close();
			return record;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
        
        
    }
	@Override
    public int getLargestId(){
    	try{
    		PreparedStatement sta=getConnection().prepareStatement("SELECT MAX(ID) FROM RECORDS");
    		ResultSet SQLres=sta.executeQuery();
    		SQLres.next();
    		return Integer.parseInt(SQLres.getString(1));
    		
    	} catch (SQLException e) {
			System.out.println(e);
			return -1;
		}
    }



	public Record getRecord() {
		return record;
	}


	public void setRecord(Record record) {
		this.record = record;
	}

}
