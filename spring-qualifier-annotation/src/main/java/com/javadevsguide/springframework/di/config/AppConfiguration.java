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
@ComponentScan("com.javadevsguide.springframework.di")
public class AppConfiguration {

	@Bean(name="emailService")
	public MessageService emailService(){
		return new EmailService();
	}
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService(){
		return new SMSService();
	}
	
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(twitterService());
	}
}
