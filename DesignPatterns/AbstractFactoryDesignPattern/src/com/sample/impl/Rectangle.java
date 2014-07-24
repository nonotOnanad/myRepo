package com.sample.impl;

import com.sample.inter.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw RECTANGLE...");
	}

}
