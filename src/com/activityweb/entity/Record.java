package com.activityweb.entity;

import java.util.Date;



public class Record {
	private String id;
	private String userId;
	private double amount;
	//���롢֧����0����֧����1�������룻
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
