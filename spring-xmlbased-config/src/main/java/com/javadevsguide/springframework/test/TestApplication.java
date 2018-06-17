package com.javadevsguide.springframework.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javadevsguide.springframework.service.MessageProcessor;
import com.javadevsguide.springframework.service.MessageProcessorImpl;

public class TestApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
		MessageProcessor  userService = applicationContext.getBean(MessageProcessorImpl.class);
		userService.processMsg("twitter message sending ");
		applicationContext.close();
	}
}
