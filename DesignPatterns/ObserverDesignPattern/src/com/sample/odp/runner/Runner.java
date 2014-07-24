package com.sample.odp.runner;

import com.sample.odp.abs.Subject;
import com.sample.odp.abs.impl.BinaryObserver;
import com.sample.odp.abs.impl.HexaObserver;
import com.sample.odp.abs.impl.OctalObserver;

public class Runner {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		
		System.out.println("Second state change: 10");
		subject.setState(10);
		
	}

}
