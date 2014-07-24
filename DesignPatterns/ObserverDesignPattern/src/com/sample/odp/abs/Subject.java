package com.sample.odp.abs;

import java.util.ArrayList;
import java.util.List;

import com.sample.odp.observer.Observer;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	private void notifyAllObservers() {
		for(Observer observer: observers){
			observer.update();
		}
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}
}
