package com.sample.odp.abs.impl;

import com.sample.odp.abs.Subject;
import com.sample.odp.observer.Observer;

public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
	}

}
