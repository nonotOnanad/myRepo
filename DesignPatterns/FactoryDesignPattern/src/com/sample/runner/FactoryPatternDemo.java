package com.sample.runner;

import com.sample.factory.ShapeFactory;
import com.sample.inter.Shape;

public class FactoryPatternDemo {

	public static void main(String[]args){
		ShapeFactory shapeFactory =  new ShapeFactory();
		
		Shape shapeA = shapeFactory.getShape("CIRCLE");
		shapeA.draw();
		
		Shape shapeB = shapeFactory.getShape("SQUARE");
		shapeB.draw();
		
		Shape shapeC = shapeFactory.getShape("RECTANGLE");
		shapeC.draw();
	}
}
