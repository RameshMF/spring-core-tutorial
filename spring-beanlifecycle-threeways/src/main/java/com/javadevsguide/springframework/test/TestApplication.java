package com.javadevsguide.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadevsguide.springframework.config.AppConfiguration;
import com.javadevsguide.springframework.service.MessageProcessor;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageProcessor  userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
	}
}
