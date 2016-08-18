package com.bootcamp.customerregistration.service;

import com.bootcamp.customerregistration.model.Customer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 * @author Nikshitha Nagelly 
 * This class has web service call using REST to get
 * customer deatils and associated service plans
 */
public class RestClient {
	public static Customer getCustomerById(int id) {
		Customer cust = null;

		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/CustomerDetailsWebService/services/rest/cust/" + id);

			ClientResponse response = webResource.accept("application/xml").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			cust = response.getEntity(Customer.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cust;
	}
}
