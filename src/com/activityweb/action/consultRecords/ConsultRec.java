package com.activityweb.action.consultRecords;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.activityweb.dao.common.RecordDao;
import com.activityweb.dao.common.impl.RecordDaoImpl;
import com.activityweb.entity.Record;
import com.activityweb.vm.record.RecordVM;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class ConsultRec extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6405977346000971981L;
	private RecordDao dao;
	private Record record;
	private String userid;
	private List<Record> recordlist;
	private RecordVM recordVM;
	private List<RecordVM> recordVMlist;
	private HttpServletRequest request;
	public ConsultRec() {
		super();
		request=ServletActionContext.getRequest();
		this.dao = new RecordDaoImpl();
		this.record = new Record();
		this.recordVMlist = new ArrayList<RecordVM>();
		this.recordVM = new RecordVM();
	}
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
		if(userid.isEmpty())
		{
			request.setAttribute("status","component/content.jsp");
			return SUCCESS;
		}
		recordlist=dao.getRecordByUserId(userid);
		for(int i= 0;i<recordlist.size();i++)
		{
			record=recordlist.get(i);
			recordVM=new RecordVM();
			recordVM.setRecord(record);
			recordVMlist.add(recordVM);
		}
		request.setAttribute("status","User/consultres.jsp");
		return SUCCESS;
	}
	public List<Record> getRecordlist() {
		return recordlist;
	}
	public void setRecordlist(List<Record> recordlist) {
		this.recordlist = recordlist;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public List<RecordVM> getRecordVMlist() {
		return recordVMlist;
	}
	public void setRecordVMlist(List<RecordVM> recordVMlist) {
		this.recordVMlist = recordVMlist;
	}
}
