package com.bootcamp.customerregistration.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bootcamp.customerregistration.jms.MyMessageSender;
import com.bootcamp.customerregistration.jms.TestJmsSender;
import com.bootcamp.customerregistration.model.Customer;
import com.bootcamp.customerregistration.service.CustomerService;
import com.bootcamp.customerregistration.service.RestClient;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CustomerController {
	@Autowired
	private CustomerService regService;

	@Autowired
	private RestClient restclient;

	@Autowired
	private MyMessageSender msgSender;
	@Autowired
	private TestJmsSender testjms;

	private static final Logger logger = LogManager.getLogger(CustomerController.class);

	@RequestMapping(value = "/custcontrol", method = RequestMethod.POST)
	public ModelAndView custcontrol(@ModelAttribute("customer") Customer customer)

	{

		logger.info("serid" + customer.getServplan().getSid());
		regService.addCustomer(customer); // inserting customer

		int sid = customer.getServplan().getSid();
		int cid = customer.getId();
		String msg = sid + ":" + cid;

		msgSender.sendMessage(msg);// JMS CALL
		Customer cust = restclient.getCustomerById(customer.getId());// REST
																		// CALL
		ModelAndView mv = new ModelAndView("custsuccess", "cust", cust);

		return mv;
	}
}
