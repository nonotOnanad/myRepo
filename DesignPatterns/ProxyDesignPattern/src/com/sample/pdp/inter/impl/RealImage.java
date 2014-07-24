package com.sample.pdp.inter.impl;

import com.sample.pdp.inter.Image;

public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName2) {
		System.out.println("Loading "+fileName);	
	}

	@Override
	public void display() {
		System.out.println("Displaying "+fileName);
	}
	

}
