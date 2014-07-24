package com.sample.nodp.abs.impl;

import com.sample.nodp.abs.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
	
	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
