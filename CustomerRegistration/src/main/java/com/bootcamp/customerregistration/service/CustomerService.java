package com.bootcamp.customerregistration.service;

import com.bootcamp.customerregistration.model.Customer;

public interface CustomerService {

	public String addCustomer(Customer cust);

	public int getCustomerid(Customer cust);

}