package com.sample.pp.abs.impl;

import com.sample.pp.abs.Shape;

public class Square extends Shape {

	public Square(){
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
	
	
}
