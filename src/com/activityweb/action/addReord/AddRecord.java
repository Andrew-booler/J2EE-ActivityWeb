package com.activityweb.action.addReord;
import java.sql.Date;


import com.opensymphony.xwork2.ActionSupport;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.dao.common.impl.RecordDaoImpl;
import com.activityweb.entity.Record;


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
		record.setUserId("10");      //暂时不知道如何获得
		record.setAmount(amount);
		record.setOccurence(occurence);
		record.setNote(note);
	}
	public void setId(String id){
		this.id =id;
	}
	public void setNote(String note){
		this.note = note;
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
			super.addFieldError("id", "请输入id！");
			return ERROR;
		}
	
		if(note==null){
			super.addFieldError("note", "请输入注释！");
			return ERROR;
		}
		this.setRecord();
		if(recordDao.setRecordIntoDB(record) == -1)
			return ERROR;
		else
			return SUCCESS;
	}

}
