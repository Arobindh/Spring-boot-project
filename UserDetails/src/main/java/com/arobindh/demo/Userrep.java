package com.arobindh.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Userrep extends JpaRepository<User, Integer>{
	List<User> findByname(String Name);
	List<User> findByuserIdGreaterThan(int userID);
	@Query("From User where NAME =?1 order by USER_ID")
	List<User> findBynamesorted(String Name);
	
}
