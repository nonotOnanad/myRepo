package com.sample.cordp.abs.impl;

import com.sample.cordp.abs.AbstractLogger;

public class FileLogger extends AbstractLogger {
	
	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: "+message);
	}

}
