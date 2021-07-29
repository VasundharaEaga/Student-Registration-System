package com.student;

public class Course {
	String cid;
	String cname;
	String desp;
	String fee;
	public Course(String cid, String cname, String desp, String fee) {
		
		this.cid = cid;
		this.cname = cname;
		this.desp = desp;
		this.fee = fee;
	}
	public Course()
	{
		
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
}
