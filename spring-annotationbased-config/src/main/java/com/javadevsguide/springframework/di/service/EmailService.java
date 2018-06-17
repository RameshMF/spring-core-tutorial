package com.javadevsguide.springframework.di.service;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
