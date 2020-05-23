package com.yoon.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoon.board.domain.User;
import com.yoon.board.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	
}
