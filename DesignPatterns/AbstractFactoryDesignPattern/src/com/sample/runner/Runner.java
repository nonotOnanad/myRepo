package com.sample.runner;

import com.sample.afp.AbstractFactory;
import com.sample.inter.Color;
import com.sample.inter.Shape;
import com.sample.producer.FactoryProducer;

public class Runner {
	public static void main(String[]args){
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		//get an object Circle
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		//get an object Square
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		//get an object Rectangle
		Shape rectangle =  shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		//get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		//get color Red
		Color red = colorFactory.getColor("red");
		red.fill();
		
		//get color Green
		Color green = colorFactory.getColor("green");
		green.fill();
		
		//get color blue
		Color blue = colorFactory.getColor("blue");
		blue.fill();
		
	}
}
