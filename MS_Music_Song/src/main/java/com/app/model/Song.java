package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	private String salbum;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSalbum() {
		return salbum;
	}
	public void setSalbum(String salbum) {
		this.salbum = salbum;
	}
	@Override
	public String toString() {
		return "Song [sid=" + sid + ", sname=" + sname + ", salbum=" + salbum + "]";
	}
	
}
