package net.javaguides.spring.dependson;

public class SecondBean {
	public SecondBean() {
		System.out.println("SecondBean Initialized via Constuctor");
	}
	
	public void display() {
		System.out.println("SecondBean method called");
	}
}
