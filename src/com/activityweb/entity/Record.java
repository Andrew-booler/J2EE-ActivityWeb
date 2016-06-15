package com.activityweb.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Record {
	private String id;
	private double amount;
	private int io;
	private Date occurence;
	private String note;
	private List<String> infolist;
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
	public void setInfolist()
	{
		infolist = new ArrayList<String>();
		infolist.add(id);
		infolist.add(String.valueOf(amount));
		infolist.add(String.valueOf(io));
		infolist.add( new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(occurence));
		infolist.add(note);
	}
	public List<String> getInfolist()
	{
		return infolist;
	}
}
