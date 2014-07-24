package com.sample.afp;

import com.sample.impl.Blue;
import com.sample.impl.Green;
import com.sample.impl.Red;
import com.sample.inter.Color;
import com.sample.inter.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		return null;
	}

}
