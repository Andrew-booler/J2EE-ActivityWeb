package com.activityweb.dao.common.impl;


import com.activityweb.connector.Connector;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.activityweb.dao.common.RecordDao;
import com.activityweb.entity.Record;


public class RecordDaoImpl implements RecordDao {
	
	private Record record;


	private Connection getConnection(){
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
	
	public int setRecordIntoDB(Record record){
        try {
			PreparedStatement stat=getConnection().prepareStatement("INSERT INTO RECORDS (USERID,IO,AMOUNT,OCCURENCE,NOTE) VALUES(?,?,?,?,?) ");
 
			stat.setInt( 1,Integer.parseInt(record.getUserId()) );
			stat.setInt(2,(int)record.getIo());
			stat.setDouble(3,record.getAmount());
			stat.setDate(4, (Date) record.getOccurence() );   
			String s = record.getNote();
			stat.setString(5,s);
			
			@SuppressWarnings("unused")
			int SQLres=stat.executeUpdate();
			stat.close();
			return 0;
		} catch (SQLException e) {
			System.out.println(e);
			return -1;
		}
	}

}
