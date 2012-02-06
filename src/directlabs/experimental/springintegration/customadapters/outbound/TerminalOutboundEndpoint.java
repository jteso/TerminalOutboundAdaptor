package directlabs.experimental.springintegration.customadapters.outbound;

import org.springframework.integration.Message;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Spring Integration Outbound adapter to write messages in the console
 * @author jtedilla
 *
 */
@Component
public class TerminalOutboundEndpoint extends AbstractMessageHandler{

	public TerminalOutboundEndpoint() {
		super();
	}

	@Override
	protected void handleMessageInternal(Message<?> message) throws Exception {
		Assert.isInstanceOf(String.class, message.getPayload(), "Payload must be a String");
		String msg = (String) message.getPayload();
		System.out.println(msg);
	}

}