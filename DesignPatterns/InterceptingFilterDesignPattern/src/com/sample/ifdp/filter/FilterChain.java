package com.sample.ifdp.filter;

import java.util.ArrayList;
import java.util.List;

import com.sample.ifdp.inter.Filter;
import com.sample.ifdp.target.Target;

public class FilterChain {
	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;
	
	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	
	public void execute(String request) {
		for(Filter filter: filters){
			filter.execute(request);
		}
		target.execute(request);
	}
	
	public void setTarget(Target target) {
		this.target = target;
	}
}
