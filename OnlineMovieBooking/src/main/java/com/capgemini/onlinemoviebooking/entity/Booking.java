package com.capgemini.onlinemoviebooking.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="movie_booking")
public class Booking {
	@Id
	@Column(name="booking_id",length=6)
	private Integer bookingId;
		
	@ManyToOne
	private Show showRef;
	
	@Column(name="booking_date",nullable=false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionalId;
	
	@Column(name="total_cost",nullable=false)
	private Double totalCost;
	
	@Column(name="no_of_seats",nullable=false)
	private int noOfSeats;
	
	@Column(name="booking_status")
	private String bookingStatus;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingId, Show showRef, LocalDate bookingDate, int transactionalId, Double totalCost,
			int noOfSeats, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
		this.transactionalId = transactionalId;
		this.totalCost = totalCost;
		this.noOfSeats = noOfSeats;
		this.bookingStatus = bookingStatus;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Show getShowRef() {
		return showRef;
	}

	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTransactionalId() {
		return transactionalId;
	}

	public void setTransactionalId(int transactionalId) {
		this.transactionalId = transactionalId;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", showRef=" + showRef + ", bookingDate=" + bookingDate
				+ ", transactionalId=" + transactionalId + ", totalCost=" + totalCost + ", noOfSeats=" + noOfSeats
				+ ", bookingStatus=" + bookingStatus + "]";
	}

	
	

}
