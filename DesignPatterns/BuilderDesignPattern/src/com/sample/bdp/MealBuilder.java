package com.sample.bdp;

import com.sample.abs.impl.ChickenBurger;
import com.sample.abs.impl.Coke;
import com.sample.abs.impl.Pepsi;
import com.sample.abs.impl.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
