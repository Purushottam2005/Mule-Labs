package com.training.airplane.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class CustomTransformer extends AbstractMessageTransformer {

	private List<String> sortList(CopyOnWriteArrayList<String> myList) {
		ArrayList<String> mylist2 = new ArrayList<String>(myList);
		Collections.sort(mylist2);
		return mylist2;
	}

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		CopyOnWriteArrayList<String> priceList = (CopyOnWriteArrayList<String>) message
				.getPayload();
		ArrayList<String> sortedList = (ArrayList<String>) sortList(priceList);

		StringBuilder returnString = new StringBuilder();
		returnString.append("<body> <h1> Search Results "
				+ message.getProperty("destination", PropertyScope.SESSION,
						"Uknown") + "</h1>");
		for (int i = 0; i < sortedList.size(); i++) {
			returnString.append("<p>" + sortedList.get(i) + "</p>");
		}
		returnString.append("</body>");

		return returnString;

	}

}