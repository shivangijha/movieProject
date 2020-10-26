package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private int userId;
	private String adminName;
	private String adminContact;
	
	public Admin(){
		super();
	}
	public Admin(int userId, String adminName, String adminContact) {
		super();
		this.userId = userId;
		this.adminName = adminName;
		this.adminContact = adminContact;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
}
