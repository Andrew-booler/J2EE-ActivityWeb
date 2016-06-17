package com.activityweb.action.addReord;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.dao.common.UserDao;
import com.activityweb.dao.common.impl.RecordDaoImpl;
import com.activityweb.dao.common.impl.UserDaoImpl;
import com.activityweb.entity.Record;
import com.activityweb.vm.record.RecordVM;


public class AddRecord extends ActionSupport {
	
	private static final long serialVersionUID = 2176544318516900434L;
	private String id;
	private int io;
	private double amount;
	private Date occurence;
	private String note;
	private Record record;
	private RecordDao recordDao;
	public AddRecord(){
		super();
		recordDao=new RecordDaoImpl();
		record = new Record();
	}
	public void setRecord(){
		record.setId(id);	
		record.setIo(io);
		record.setUserId();      //��ʱ��֪����λ��
		record.setAmount(amount);
		record.setOccurence(occurence);
		record.setNote(note);
	}
	public void setId(String id){
		this.id =id;
	}
	public void setIo(String io){
		this.io = Integer.parseInt(io);
	}
	
	public void setAmount(String amount){
		this.amount = Double.parseDouble(amount);
	}
	public void setOccurence(String occurence){
		this.occurence = Date.valueOf(occurence);
	}
	public String execute() throws Exception{
		if(id.isEmpty()){
			super.addFieldError("id", "������id��");
			return ERROR;
		}
	
		if(note.isEmpty()){
			super.addFieldError("note", "������ע�ͣ�");
			return ERROR;
		}
		this.setRecord();
		recordDao.setRecordIntoDB(record);
		return SUCCESS;
	}

}