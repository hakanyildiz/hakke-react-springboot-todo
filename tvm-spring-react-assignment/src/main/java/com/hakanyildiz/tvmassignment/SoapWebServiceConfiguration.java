package com.hakanyildiz.tvmassignment;

import com.hakanyildiz.tvmassignment.SoapWebServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapWebServiceConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("soapexample.wsdl");
		return marshaller;
	}

	@Bean
	public SoapWebServiceClient greetingClient(Jaxb2Marshaller marshaller) {
		SoapWebServiceClient swsClient = new SoapWebServiceClient();
		swsClient.setDefaultUri("ttp://soapclient.com/xml/soapresponder.wsdl");
		swsClient.setMarshaller(marshaller);
		swsClient.setUnmarshaller(marshaller);
		return swsClient;
	}

}