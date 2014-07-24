package com.sample.idp.runner;

import com.sample.idp.inter.Iterator;
import com.sample.idp.inter.impl.NameRepository;

public class Runner {
	
	public static void main(String[]args){
		NameRepository nameRepository = new NameRepository();
		for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
			String name = (String) iter.next();
			System.out.println("Name : "+name);
		}
	}
}
