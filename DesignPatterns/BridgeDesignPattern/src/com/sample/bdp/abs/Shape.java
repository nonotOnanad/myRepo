package com.sample.bdp.abs;

import com.sample.bdp.inter.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
