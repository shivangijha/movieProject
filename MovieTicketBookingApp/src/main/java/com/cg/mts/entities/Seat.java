package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {
	@Id
	private int seatId;
	private String seatNumber;
	private String type;
	private double price;

	public Seat() {
		super();
	}

	public Seat(int seatId, String seatNumber, String type, double price) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
