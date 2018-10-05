package net.javaguides.spring.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean firstBean = context.getBean(FirstBean.class);
		firstBean.test();
		context.close();
	}
}
