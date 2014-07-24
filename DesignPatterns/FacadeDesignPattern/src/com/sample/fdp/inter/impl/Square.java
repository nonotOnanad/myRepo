package com.sample.fdp.inter.impl;

import com.sample.fdp.inter.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
