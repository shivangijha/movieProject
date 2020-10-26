package com.cg.mts.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	private int ticketId;
	private int noOfSeats;
	private List<String> seatNumber;
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;

	public Ticket() {
		super();
	}
	public Ticket(int ticketId, int noOfSeats, List<String> seatNumber, Booking bookingRef, boolean ticketStatus,
			String screenName) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNumber = seatNumber;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<String> getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(List<String> seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Booking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
}
