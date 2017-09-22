package com.hakanyildiz.tvmassignment;

import soapexample.wsdl.Method1Response;

import com.hakanyildiz.tvmassignment.SoapWebServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TvmAssignmentApplication {

	private static String param1 = "Uchiha";
	private static String param2 = "Hakke";
	
	@Autowired
	SoapWebServiceClient swsClient;
	
	public static void main(String[] args) {
		SpringApplication.run(TvmAssignmentApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Method1Response response = swsClient.getData(param1,param2);
		swsClient.logResponse(response);
	}
}
