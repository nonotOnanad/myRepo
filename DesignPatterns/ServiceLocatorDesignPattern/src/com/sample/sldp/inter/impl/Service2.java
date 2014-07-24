package com.sample.sldp.inter.impl;

import com.sample.sldp.inter.Service;

public class Service2 implements Service {

	@Override
	public String getName() {
		return "Service2";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}
