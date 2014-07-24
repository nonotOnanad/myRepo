package com.sample.ifdp.filter;

import com.sample.ifdp.inter.Filter;
import com.sample.ifdp.target.Target;

public class FilterManager {
	FilterChain filterChain;
	
	public FilterManager(Target target) {
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
}
