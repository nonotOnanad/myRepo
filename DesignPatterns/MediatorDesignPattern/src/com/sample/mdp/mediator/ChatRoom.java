package com.sample.mdp.mediator;

import java.util.Date;

import com.sample.mdp.model.User;

public class ChatRoom {
	public static void showMessage(User user, String message){
		System.out.println(new Date().toString()
				+ " ["+user.getName()+"] : "+message);
	}
}
