package com.sample.producer;

import com.sample.afp.AbstractFactory;
import com.sample.afp.ColorFactory;
import com.sample.afp.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}
}
