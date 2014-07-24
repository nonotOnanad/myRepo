package com.sample.bddp.client;

import com.sample.bddp.lookup.BusinessDelegate;

public class Client {
	
	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
