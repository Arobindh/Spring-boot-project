package com.arobindh.demo;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int userId;
	private String name;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}

}
