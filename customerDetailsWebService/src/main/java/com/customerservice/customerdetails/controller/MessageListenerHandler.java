package com.customerservice.customerdetails.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customerservice.customerdetails.jms.MyMessageListener;
import com.customerservice.customerdetails.jms.TestListener;

	
	@Controller
	@RequestMapping(value = "/listenercontrol")
	public class MessageListenerHandler {
		private static final Logger logger=LogManager.getLogger(MessageListenerHandler.class);
		@RequestMapping(value = "/listener", method = RequestMethod.GET)
		@ResponseBody
		public static String loadListener() {
			
			logger.info("hi i am listener");
			System.out.println("in controller");
			
			//MyMessageListener msgLisner = new MyMessageListener();
		
			
			//TestListener.loadListener();
			
			System.out.println("hello,listener loaded");
			
			String msg="Jms Listerner is running";
			//String json = new Gson().toJson(msg);

			return msg;

		}

	}

