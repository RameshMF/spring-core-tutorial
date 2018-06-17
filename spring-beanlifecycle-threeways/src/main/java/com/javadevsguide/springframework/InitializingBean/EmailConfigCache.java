package com.javadevsguide.springframework.InitializingBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class EmailConfigCache implements InitializingBean{
	
	private void initializeEmailConfig(){
		Email email = new Email();
		email.setSubject("Demo mail");
		email.setMsg("Demo mail message");
		email.setTo("ramesh@gmail.com");
		email.setFrom("ramesh@gmail.com");
		System.out.println(email.toString());
	}

	public void afterPropertiesSet() throws Exception {
		initializeEmailConfig();
	}
}

class Email{
	private String subject;
	private String to;
	private String from;
	private String msg;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Email [subject=" + subject + ", to=" + to + ", from=" + from + ", msg=" + msg + "]";
	}
}