package com.sample.bddp.runner;

import com.sample.bddp.client.Client;
import com.sample.bddp.lookup.BusinessDelegate;

public class Runner {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
