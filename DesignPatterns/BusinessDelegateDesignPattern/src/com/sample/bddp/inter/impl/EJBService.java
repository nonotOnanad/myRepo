package com.sample.bddp.inter.impl;

import com.sample.bddp.inter.BusinessService;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}

}
