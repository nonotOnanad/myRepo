package com.sample.pdp.runner;

import com.sample.pdp.inter.Image;
import com.sample.pdp.inter.impl.ProxyImage;

public class Runner {

	public static void main(String[] args) {
		Image image = new ProxyImage("test 10mb.jpg");
		
		//image will be loaded from disk
		image.display();
		
		System.out.println("");
		//image will not be loaded form disk
		image.display();
	}

}
