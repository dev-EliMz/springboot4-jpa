package com.devmztesting.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmztesting.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
