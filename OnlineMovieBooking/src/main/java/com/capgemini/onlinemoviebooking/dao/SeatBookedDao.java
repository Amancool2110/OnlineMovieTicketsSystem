package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.SeatsBooked;

public interface SeatBookedDao extends JpaRepository<SeatsBooked, Integer>{

}
