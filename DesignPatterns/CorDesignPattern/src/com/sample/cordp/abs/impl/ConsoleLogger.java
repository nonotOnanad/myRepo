package com.sample.cordp.abs.impl;

import com.sample.cordp.abs.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: "+message);
	}

}
