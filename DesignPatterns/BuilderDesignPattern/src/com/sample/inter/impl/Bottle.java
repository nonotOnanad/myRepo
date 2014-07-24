package com.sample.inter.impl;

import com.sample.inter.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
