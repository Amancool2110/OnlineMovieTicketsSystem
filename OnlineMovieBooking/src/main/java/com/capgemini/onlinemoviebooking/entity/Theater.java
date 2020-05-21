package com.capgemini.onlinemoviebooking.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="movie_theater")
public class Theater{
	@Id
	@Column(name="theaterId")
	private Integer theaterId;
	
	@Column(name="theaterName",length=25,nullable=false)
	private String theaterName;
	
	@Column(name="theaterCity",length=25,nullable=false)
	private String theaterCity;
	
	@Column(name ="managerName",length=25,nullable=false)
	private String managerName;
	
	@Column(name ="managerContact",length=11)
	private String managerContact;
	
	
	
	
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theater(Integer theaterId, String theaterName, String theaterCity, String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		
	}
	
	
	
	
}
