package com.yoon.board.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {

	@Id @GeneratedValue
	private Long id;
	
	
}
