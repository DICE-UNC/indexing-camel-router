package camelrouter;
import org.apache.camel.Body;

import databook.listener.service.*;
public class MessagingServiceBean {

	private MessagingService ms;

	public void setMessagingService(MessagingService ms) {
		this.ms = ms;
	}
	
	public void consume(@Body String message) {
		System.out.println("message received" + message);
		String message2 = message.substring(message.indexOf('{'));
		ms.handle(message2);
	}
}
