package com.yoon.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yoon.board.domain.User;
import com.yoon.board.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id){
		User user = userService.findUser(id);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
}
