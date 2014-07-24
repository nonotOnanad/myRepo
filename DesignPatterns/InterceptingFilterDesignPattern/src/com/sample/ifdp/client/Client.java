package com.sample.ifdp.client;

import com.sample.ifdp.filter.FilterManager;

public class Client {
	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
