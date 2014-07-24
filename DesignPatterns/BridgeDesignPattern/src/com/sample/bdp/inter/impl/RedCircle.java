package com.sample.bdp.inter.impl;

import com.sample.bdp.inter.DrawAPI;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[color: red, radius: "
				+ radius +", x: "+x+", "+y+"]");
	}

}
