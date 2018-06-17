package com.javadevsguide.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.javadevsguide.springframework.di.service.EmailService;
import com.javadevsguide.springframework.di.service.MessageProcessor;
import com.javadevsguide.springframework.di.service.MessageProcessorImpl;
import com.javadevsguide.springframework.di.service.MessageService;
import com.javadevsguide.springframework.di.service.SMSService;
import com.javadevsguide.springframework.di.service.TwitterService;

@Configuration
public class AppConfiguration2 {
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
		
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(twitterService());
	}
}
