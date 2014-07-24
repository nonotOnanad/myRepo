package com.sample.adp.inter.impl;

import com.sample.adp.inter.AdvancedMediaPlayer;
import com.sample.adp.inter.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		} else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		} else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
