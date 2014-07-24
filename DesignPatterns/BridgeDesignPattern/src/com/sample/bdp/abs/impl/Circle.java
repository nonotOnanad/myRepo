package com.sample.bdp.abs.impl;

import com.sample.bdp.abs.Shape;
import com.sample.bdp.inter.DrawAPI;

public class Circle extends Shape {
	private int x,y,radius;
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
