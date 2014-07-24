package com.sample.odp.abs.impl;

import com.sample.odp.abs.Subject;
import com.sample.odp.observer.Observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
	}

}
