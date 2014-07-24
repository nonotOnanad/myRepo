package com.sample.sdp.context;

import com.sample.sdp.inter.State;

public class Context {
	private State state;

	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
