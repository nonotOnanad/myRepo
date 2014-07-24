package com.sample.tdp.runner;

import com.sample.tdp.abs.Game;
import com.sample.tdp.abs.impl.Cricket;
import com.sample.tdp.abs.impl.Football;

public class Runner {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
