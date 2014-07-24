package com.sample.ddp.runner;

import com.sample.ddp.abs.impl.RedShapeDecorator;
import com.sample.ddp.inter.Shape;
import com.sample.ddp.inter.impl.Circle;
import com.sample.ddp.inter.impl.Rectangle;

public class Runner {
	public static void main(String[]args){
		
		Shape circle = new Circle();
		
		Shape redCircle =  new RedShapeDecorator(new Circle());
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
		
	}
}
