package com.sample.fdp.inter.impl;

import com.sample.fdp.inter.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
