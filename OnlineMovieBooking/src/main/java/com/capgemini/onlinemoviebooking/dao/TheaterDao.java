package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.Theater;

public interface TheaterDao extends JpaRepository<Theater, Integer> {

}
