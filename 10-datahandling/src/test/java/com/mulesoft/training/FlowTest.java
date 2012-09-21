package com.mulesoft.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class FlowTest extends FunctionalTestCase {
	@Test
	public void testNegate1() throws MuleException {
/*	    String msg = "Hi!";
	    HttpProxyServer proxyServer = new DefaultHttpProxyServer(50103);
	    proxyServer.start();
	    MuleClient client = new MuleClient(muleContext);
	    MuleMessage result = client.send(
	            "http://localhost:50102/gateway.in?connector=http.connector"
	            , msg, null);
	    String payload = result.getPayloadAsString();
	    proxyServer.stop();
	    Assert.assertTrue("Did not receive HelloWorld!: " + payload, "HelloWorld!".equals(payload));*/	}

	@Override
	protected String getConfigResources() {
		// TODO Auto-generated method stub
		return "src/main/app/3-routing.xml";
	}
}