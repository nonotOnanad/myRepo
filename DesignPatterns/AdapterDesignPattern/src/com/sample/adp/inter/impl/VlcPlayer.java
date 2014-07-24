package com.sample.adp.inter.impl;

import com.sample.adp.inter.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
	}

}
