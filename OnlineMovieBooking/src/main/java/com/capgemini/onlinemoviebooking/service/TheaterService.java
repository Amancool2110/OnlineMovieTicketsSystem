package com.capgemini.onlinemoviebooking.service;

import java.util.List;

import com.capgemini.onlinemoviebooking.entity.Theater;

public interface TheaterService {
	public Theater addTheater(Theater theater);
	public Boolean deleteTheater(Integer theaterId);
	
	public List<Theater> showAllTheater();
	public Theater showTheater(int id);

}
