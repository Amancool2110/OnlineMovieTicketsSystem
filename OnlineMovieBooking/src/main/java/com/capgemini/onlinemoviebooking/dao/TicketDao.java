package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
