package net.javaguides.spring.ioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("applicationContext.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
	}
}
