package net.javaguides.spring.dependson;

public class ThirdBean {
	public ThirdBean() {
		System.out.println("ThirdBean Initialized via Constuctor");
	}
	
	public void display() {
		System.out.println("ThirdBean method called");
	}
}
