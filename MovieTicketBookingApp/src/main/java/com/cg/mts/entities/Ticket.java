package com.cg.mts.entities;

import java.util.List;

public class Ticket {
private int ticketId;
private int noOfSeats;
private List<String> seatNumber;
private Booking bookingRef;
private boolean ticketStatus;
private String screenName;

public Ticket()
{
	super();
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
