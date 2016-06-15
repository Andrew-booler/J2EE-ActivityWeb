package com.activityweb.action.consultRecords;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.dao.common.impl.RecordDaoImpl;
import com.activityweb.entity.Record;

public class ConsultRec extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6405977346000971981L;
	private RecordDao dao;
	private Record record;
	private List<Record> recordlist;
	public RecordDao getDao() {
		return dao;
	}
	public void setDao(RecordDao dao) {
		this.dao = dao;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	
	public String execute(){
		dao=new RecordDaoImpl();
		int numOfRecord = dao.getLargestId();
		for(int i = 1; i <= numOfRecord;i++ )
		{
			record=dao.getRecordById(String.valueOf(i));
			record.setInfolist();//make id amount...into a list
			recordlist=new ArrayList<Record>();
			recordlist.add(record);
		}
		
		return SUCCESS;
	}
}
