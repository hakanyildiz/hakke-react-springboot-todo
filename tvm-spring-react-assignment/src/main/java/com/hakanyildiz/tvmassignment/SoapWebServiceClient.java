package com.hakanyildiz.tvmassignment;

import soapexample.wsdl.Method1;
import soapexample.wsdl.Method1Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapWebServiceClient extends WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(SoapWebServiceClient.class);
	
	public Method1Response getData(String param1,String param2) {

		Method1 request = new Method1();
		request.setParam1(param1);
		request.setParam2(param2);
		
		log.info("Param1 => " + param1 + ", Param2 => "+ param2);

		Method1Response response = (Method1Response) getWebServiceTemplate()
				.marshalSendAndReceive(
						"http://soapclient.com/xml/soapresponder.wsdl",
						request,
						new SoapActionCallback("http://soapclient.com/xml/soapresponder.wsdl"));

		return response;
	}

	public void logResponse(Method1Response response) {

		log.info(response);	
	
	}

}