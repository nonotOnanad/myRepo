package com.sample.abs;

import com.sample.inter.Item;
import com.sample.inter.Packing;
import com.sample.inter.impl.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
