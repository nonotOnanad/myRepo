package com.sample.sdp.runner;

import com.sample.sdp.ctx.Context;
import com.sample.sdp.inter.impl.OperationAdd;
import com.sample.sdp.inter.impl.OperationMultiply;
import com.sample.sdp.inter.impl.OperationSubtract;

public class Runner {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
