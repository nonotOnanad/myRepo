package com.sample.impl;

import com.sample.inter.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw Square...");
	}

}
