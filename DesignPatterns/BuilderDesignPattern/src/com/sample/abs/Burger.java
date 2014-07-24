package com.sample.abs;

import com.sample.inter.Item;
import com.sample.inter.Packing;
import com.sample.inter.impl.Wrapper;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
