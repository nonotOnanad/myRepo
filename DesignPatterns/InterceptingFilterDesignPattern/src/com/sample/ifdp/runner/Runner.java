package com.sample.ifdp.runner;

import com.sample.ifdp.client.Client;
import com.sample.ifdp.filter.FilterManager;
import com.sample.ifdp.inter.impl.AuthenticationFilter;
import com.sample.ifdp.inter.impl.DebugFilter;
import com.sample.ifdp.target.Target;

public class Runner {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}

}
