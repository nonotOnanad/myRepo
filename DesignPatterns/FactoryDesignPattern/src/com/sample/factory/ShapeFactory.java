package com.sample.factory;

import com.sample.impl.Circle;
import com.sample.impl.Rectangle;
import com.sample.impl.Square;
import com.sample.inter.Shape;

public class ShapeFactory {

	public Shape getShape(String shapeType){
		Shape shapeRet = null;

		if("CIRCLE".equalsIgnoreCase(shapeType)){
			shapeRet = new Circle();
		} else if("RECTANGLE".equalsIgnoreCase(shapeType)){
			shapeRet = new Rectangle();
		} else if("SQUARE".equalsIgnoreCase(shapeType)){
			shapeRet =  new Square();
		}

		return shapeRet;
	}
}
