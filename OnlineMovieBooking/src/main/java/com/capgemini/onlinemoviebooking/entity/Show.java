package com.capgemini.onlinemoviebooking.entity;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="movie_show")
public class Show {
	@Id
	@Column(name="show_id")
	private int showId;
	@Column(name="show_name", length=25)
	private String showName;
	
	@Column(name="show_start_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime showstartTime;
	
	@Column(name="show_end_time")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime showendTime;
	
	@Column(name="total_no_of_seats")
	private int totalNoOfSeats;
	
	@Column(name="no_available_seats")
	private int noOfAvailableSeats;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JsonIgnore
	private List<Seat> seats;
	
	@OneToOne(fetch=FetchType.EAGER)
	
	private Movie movieRef;
	
	@OneToOne (fetch=FetchType.EAGER)
	private Theater theater;

	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Show(int showId, String showName, LocalDateTime showstartTime, LocalDateTime showendTime, int totalNoOfSeats,
			int noOfAvailableSeats, List<Seat> seats, Movie movieRef, Theater theater) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.showstartTime = showstartTime;
		this.showendTime = showendTime;
		this.totalNoOfSeats = totalNoOfSeats;
		this.noOfAvailableSeats = noOfAvailableSeats;
		this.seats = seats;
		this.movieRef = movieRef;
		this.theater = theater;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public LocalDateTime getShowstartTime() {
		return showstartTime;
	}

	public void setShowstartTime(LocalDateTime showstartTime) {
		this.showstartTime = showstartTime;
	}

	public LocalDateTime getShowendTime() {
		return showendTime;
	}

	public void setShowendTime(LocalDateTime showendTime) {
		this.showendTime = showendTime;
	}

	public int getTotalNoOfSeats() {
		return totalNoOfSeats;
	}

	public void setTotalNoOfSeats(int totalNoOfSeats) {
		this.totalNoOfSeats = totalNoOfSeats;
	}

	public int getNoOfAvailableSeats() {
		return noOfAvailableSeats;
	}

	public void setNoOfAvailableSeats(int noOfAvailableSeats) {
		this.noOfAvailableSeats = noOfAvailableSeats;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public Movie getMovieRef() {
		return movieRef;
	}

	public void setMovieRef(Movie movieRef) {
		this.movieRef = movieRef;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showName=" + showName + ", showstartTime=" + showstartTime
				+ ", showendTime=" + showendTime + ", totalNoOfSeats=" + totalNoOfSeats + ", noOfAvailableSeats="
				+ noOfAvailableSeats + ", seats=" + seats + ", movieRef=" + movieRef + ", theater=" + theater + "]";
	}

	


}