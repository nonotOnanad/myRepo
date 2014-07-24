package com.sample.ifdp.inter.impl;

import com.sample.ifdp.inter.Filter;

public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}

}
