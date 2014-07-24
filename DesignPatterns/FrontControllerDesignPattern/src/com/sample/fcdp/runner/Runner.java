package com.sample.fcdp.runner;

import com.sample.fcdp.controller.FrontController;

public class Runner {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}

}
