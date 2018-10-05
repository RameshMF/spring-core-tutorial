package net.javaguides.spring.dependson;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	
	@Autowired
	private SecondBean secondBean;
	
	@Autowired
	private ThirdBean thirdBean;
	
	public FirstBean() {
		System.out.println("FirstBean Initialized via Constuctor");
	}
	
	public void populateBeans() {
		secondBean.display();
		thirdBean.display();
	}
}
