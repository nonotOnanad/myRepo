package com.sample.afp;

import com.sample.impl.Circle;
import com.sample.impl.Rectangle;
import com.sample.impl.Square;
import com.sample.inter.Color;
import com.sample.inter.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape == null){
			return null;
		}
		
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		} else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}


}
