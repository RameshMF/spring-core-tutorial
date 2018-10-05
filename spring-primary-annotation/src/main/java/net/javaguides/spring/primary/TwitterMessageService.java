package net.javaguides.spring.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TwitterMessageService implements MessageService {
	@Override
	public void sendMsg() {
		System.out.println("TwitterMessageService Implementation here" );
	}
}
