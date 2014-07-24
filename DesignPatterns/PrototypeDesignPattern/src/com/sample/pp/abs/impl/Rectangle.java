package com.sample.pp.abs.impl;

import com.sample.pp.abs.Shape;

public class Rectangle extends Shape {
	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
