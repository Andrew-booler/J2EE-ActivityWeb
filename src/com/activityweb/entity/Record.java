package com.activityweb.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Record {
	private String id;
	private double amount;
	//收入、支出，0代表支出，1代表收入；
	private int io;
	private Date occurence;
	private String note;

	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIo() {
		return io;
	}
	public void setIo(int io) {
		this.io = io;
	}
	public Date getOccurence() {
		return occurence;
	}
	public void setOccurence(Date occurence) {
		this.occurence = occurence;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

}
