package com.sample.nodp.factory;

import com.sample.nodp.abs.AbstractCustomer;
import com.sample.nodp.abs.impl.NullCustomer;
import com.sample.nodp.abs.impl.RealCustomer;

public class CustomerFactory {
	
	public static final String[] names = {"Rob","Joe","Julie"};
	
	public static AbstractCustomer getCustomer(String name){
		for(int i=0; i<names.length; i++){
			if(names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
	
}
