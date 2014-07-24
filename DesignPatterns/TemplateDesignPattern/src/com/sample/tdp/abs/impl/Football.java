package com.sample.tdp.abs.impl;

import com.sample.tdp.abs.Game;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Football Game Initialized. Enjoy the game!");
	}

	@Override
	public void startPlay() {
		System.out.println("Football Game Started. Start playing.");
	}

	@Override
	public void endPlay() {
		System.out.println("Football Game Finished!");
	}

}
