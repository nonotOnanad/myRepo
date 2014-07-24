package com.sample.mdp.caretaker;

import java.util.ArrayList;
import java.util.List;

import com.sample.mdp.memento.Memento;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento state){
		mementoList.add(state);
	}
	
	public Memento get(int index){
		return mementoList.get(index);
	}
}
