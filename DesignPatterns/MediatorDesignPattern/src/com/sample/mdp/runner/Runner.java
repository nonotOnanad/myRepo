package com.sample.mdp.runner;

import com.sample.mdp.model.User;

public class Runner {

	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}

}
