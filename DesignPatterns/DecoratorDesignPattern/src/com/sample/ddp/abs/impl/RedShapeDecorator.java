package com.sample.ddp.abs.impl;

import com.sample.ddp.abs.ShapeDecorator;
import com.sample.ddp.inter.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setBorder(decoratedShape);
	}

	private void setBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
