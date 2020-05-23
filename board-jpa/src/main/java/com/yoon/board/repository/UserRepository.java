package com.yoon.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoon.board.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
