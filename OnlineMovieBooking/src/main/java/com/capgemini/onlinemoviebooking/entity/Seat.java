package com.capgemini.onlinemoviebooking.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@Entity

@DynamicUpdate
@Table(name="movie_seat")
public class Seat {
	//public enum seatStatusEnum{Available,Blocked};

@Id
@Column(name="seat_id",length=6)
private int seatId;

@Enumerated(EnumType.STRING)
private BookingState seatStatus;

//private Enum seatStatus;
@Column(name="seat_Price")
private double seatPrice;

public int getSeatId() {
	return seatId;
}

public void setSeatId(int seatId) {
	this.seatId = seatId;
}

public BookingState getSeatStatus() {
	return seatStatus;
}

public void setSeatStatus(BookingState seatStatus) {
	this.seatStatus = seatStatus;
}

public double getSeatPrice() {
	return seatPrice;
}

public void setSeatPrice(double seatPrice) {
	this.seatPrice = seatPrice;
}

public Seat(int seatId, BookingState seatStatus, double seatPrice) {
	super();
	this.seatId = seatId;
	this.seatStatus = seatStatus;
	this.seatPrice = seatPrice;
}

public Seat() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Seat [seatId=" + seatId + ", seatStatus=" + seatStatus + ", seatPrice=" + seatPrice + "]";
}



}
