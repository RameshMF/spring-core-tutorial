package net.javaguides.spring.primary;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {

	@Override
	public void sendMsg() {
		System.out.println("EmailMessageService Implementation here");
	}
}
