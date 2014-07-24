package com.sample.odp.abs.impl;

import com.sample.odp.abs.Subject;
import com.sample.odp.observer.Observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hexa String: "+Integer.toHexString(subject.getState()));
	}

}
