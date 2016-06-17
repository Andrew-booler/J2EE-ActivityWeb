package com.activityweb.action.consultRecords;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.dao.common.impl.RecordDaoImpl;
import com.activityweb.entity.Record;
import com.activityweb.vm.record.RecordVM;

public class ConsultRec extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6405977346000971981L;
	public ConsultRec() {
		super();
		this.dao = new RecordDaoImpl();
		this.record = new Record();
		this.recordlist = new ArrayList<RecordVM>();
		this.recordVM = new RecordVM();
	}
	private RecordDao dao;
	private Record record;
	private List<RecordVM> recordlist;
	private RecordVM recordVM;
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
		int numOfRecord = dao.getLargestId();
		for(int i = 1; i <= numOfRecord;i++ )
		{
			record=dao.getRecordById(String.valueOf(i));
			recordVM.setRecord(record);
			recordlist.add(recordVM);
		}
		
		return SUCCESS;
	}
	public List<RecordVM> getRecordlist() {
		return recordlist;
	}
	public void setRecordlist(List<RecordVM> recordlist) {
		this.recordlist = recordlist;
	}
}
