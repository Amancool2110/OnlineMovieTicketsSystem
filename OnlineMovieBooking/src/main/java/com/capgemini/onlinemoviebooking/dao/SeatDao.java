package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.Seat;

public interface SeatDao extends JpaRepository<Seat, Integer>{

}
