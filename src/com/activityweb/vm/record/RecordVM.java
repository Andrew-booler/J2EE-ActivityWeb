package com.activityweb.vm.record;

import java.text.SimpleDateFormat;

import com.activityweb.entity.Record;

public class RecordVM {

	private Record record;
	private String occurenceView;
	private String ioName;
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public String getOccurenceView() {
		occurenceView=new SimpleDateFormat("yyyy-MM-dd").format(record.getOccurence());
		return occurenceView;
	}
	public String getIoName() {
		if(0==record.getIo()){
			ioName= "支出";
		}else{
			ioName= "收入";
		}
		return ioName;
	}
	public void setOccurenceView(String occurenceView) {
		this.occurenceView = occurenceView;
	}
	public void setIoName(String ioName) {
		this.ioName = ioName;
	}

}
