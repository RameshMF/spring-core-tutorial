package net.javaguides.spring.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean bean = context.getBean(FirstBean.class);
		bean.populateBeans();
		context.close();
	}
}
