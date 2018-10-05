package net.javaguides.spring.primary;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {
	@Override
	public void sendMsg() {
		System.out.println("FacebookMessageService implementation here");
	}
}
