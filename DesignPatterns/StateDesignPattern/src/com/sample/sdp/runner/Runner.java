package com.sample.sdp.runner;

import com.sample.sdp.context.Context;
import com.sample.sdp.inter.impl.StartState;
import com.sample.sdp.inter.impl.StopState;

public class Runner {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
				
	}

}
