package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Retailer {
	int rid;
	int pid;
	String rname;
	int pprice;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public Retailer(int pid, String rname, int pprice) {
		super();
		this.pid = pid;
		this.rname = rname;
		this.pprice = pprice;
	}
	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
