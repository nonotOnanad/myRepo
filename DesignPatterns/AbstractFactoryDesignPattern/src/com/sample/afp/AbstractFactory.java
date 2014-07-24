package com.sample.afp;

import com.sample.inter.Color;
import com.sample.inter.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
