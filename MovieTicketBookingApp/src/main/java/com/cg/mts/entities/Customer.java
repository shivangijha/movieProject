package com.cg.mts.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String userId;
	private String customerName;
	private String mobileNumber;
	private List<Ticket> myTickets;
	
	public Customer() {
		super();
	}
	public Customer(String userId, String customerName, String mobileNumber, List<Ticket> myTickets) {
		super();
		this.userId = userId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.myTickets = myTickets;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public List<Ticket> getMyTickets() {
		return myTickets;
	}
	public void setMyTickets(List<Ticket> myTickets) {
		this.myTickets = myTickets;
	}
		
}