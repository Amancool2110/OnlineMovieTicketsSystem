package com.capgemini.onlinemoviebooking.entity;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@Entity
@Table(name="movie_Ticket")
public class Ticket {
@Id
@Column(name="ticket_id")
private int ticketId;

@Column(name="noofseats")
private int noOfSeats;

@Column(name="seatName")
private String seatName;

@Column(name="Screenname")
private String screenName;

@ManyToOne
@JoinColumn(name="booking_id")
private Booking bookingRef;

public Ticket(int ticketId, int noOfSeats, String seatName, String screenName, Booking bookingRef) {
	super();
	this.ticketId = ticketId;
	this.noOfSeats = noOfSeats;
	this.seatName = seatName;
	this.screenName = screenName;
	this.bookingRef = bookingRef;
}

public Ticket() {
	super();
	// TODO Auto-generated constructor stub
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

public String getSeatName() {
	return seatName;
}

public void setSeatName(String seatName) {
	this.seatName = seatName;
}

public String getScreenName() {
	return screenName;
}

public void setScreenName(String screenName) {
	this.screenName = screenName;
}

public Booking getBookingRef() {
	return bookingRef;
}

public void setBookingRef(Booking bookingRef) {
	this.bookingRef = bookingRef;
}

@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName + ", screenName="
			+ screenName + ", bookingRef=" + bookingRef + "]";
}






}
