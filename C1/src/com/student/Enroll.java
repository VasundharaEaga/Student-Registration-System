package com.student;

public class Enroll {
	String sname;
	String cid;
	String cname;
	String phoneno;
	public Enroll()
	{
		
	}
	public Enroll(String sname, String cid, String cname, String phoneno) {
		super();
		this.sname = sname;
		this.cid = cid;
		this.cname = cname;
		this.phoneno = phoneno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
}
