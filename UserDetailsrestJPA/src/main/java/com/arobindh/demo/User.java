package com.arobindh.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int uid;
	private String name;
	private String tech;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", tech=" + tech + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
