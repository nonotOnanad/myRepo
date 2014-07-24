package com.sample.sdp.inter.impl;

import com.sample.sdp.context.Context;
import com.sample.sdp.inter.State;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop State";
	}

}
