package com.training.airplane.custom;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class SavePayloadTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {	
		message.setProperty("destination", message.getPayload(), PropertyScope.SESSION);
		return message;
	}

}