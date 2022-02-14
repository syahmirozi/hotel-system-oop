package com.trivago.main;

import com.trivago.main.Controller.WindowManager;

public class Main {

	public static void main(String[] args) {
		
		
		
		WindowManager winMgr = new WindowManager();
		
		winMgr.Run();
		
		System.out.println("Hi");
	}
	
	public static void StateManager(State _state) {
		
		
		
	}

	public enum State{
		SPLASHSCREEN,
		
	}
}
