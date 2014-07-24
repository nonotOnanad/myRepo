package com.sample.bddp.inter.impl;

import com.sample.bddp.inter.BusinessService;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
