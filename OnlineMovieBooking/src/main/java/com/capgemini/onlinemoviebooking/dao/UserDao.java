package com.capgemini.onlinemoviebooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinemoviebooking.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
