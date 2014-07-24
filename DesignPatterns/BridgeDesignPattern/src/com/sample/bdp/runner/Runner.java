package com.sample.bdp.runner;

import com.sample.bdp.abs.Shape;
import com.sample.bdp.abs.impl.Circle;
import com.sample.bdp.inter.impl.GreenCircle;
import com.sample.bdp.inter.impl.RedCircle;

public class Runner {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100,100,10, new RedCircle());
		Shape greenCircle = new Circle(100,100,10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
