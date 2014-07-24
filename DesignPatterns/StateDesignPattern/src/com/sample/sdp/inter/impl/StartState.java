package com.sample.sdp.inter.impl;

import com.sample.sdp.context.Context;
import com.sample.sdp.inter.State;

public class StartState implements State{
	
	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
