package com.sample.odp.observer;

import com.sample.odp.abs.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
