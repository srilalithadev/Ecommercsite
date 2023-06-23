package com.luv2code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luv2code.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByEmailIdAndPassword(String emailId, String password);
	
	List<User> findByfirstNameContaining(String firstName);
	
	List<User> findByfirstNameContainingIgnoreCase(String firstName);
	
	
	@Query("from User")
	public List<User> getUsers();
	
}
