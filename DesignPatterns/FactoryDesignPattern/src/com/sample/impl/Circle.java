package com.sample.impl;

import com.sample.inter.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw Circle...");
	}

}
