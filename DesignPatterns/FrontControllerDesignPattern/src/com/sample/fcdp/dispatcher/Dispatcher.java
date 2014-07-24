package com.sample.fcdp.dispatcher;

import com.sample.fcdp.view.HomeView;
import com.sample.fcdp.view.StudentView;

public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;
	
	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatch(String request){
		if(request.equalsIgnoreCase("STUDENT")){
			studentView.show();
		}else{
			homeView.show();
		}
	}
}
