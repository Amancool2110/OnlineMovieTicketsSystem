package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer> {

}
