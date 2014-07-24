package com.sample.fdp.facade;

import com.sample.fdp.inter.Shape;
import com.sample.fdp.inter.impl.Circle;
import com.sample.fdp.inter.impl.Rectangle;
import com.sample.fdp.inter.impl.Square;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
	
	
}
