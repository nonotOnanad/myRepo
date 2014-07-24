package com.sample.sldp.runner;

import com.sample.sldp.inter.Service;
import com.sample.sldp.locator.ServiceLocator;

public class Runner {

	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
	}

}
