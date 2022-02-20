package com.trivago.main;

import com.trivago.main.Controller.WindowManager;

public class Main {
	
	private static State currentState;
	public static WindowManager winMgr;
	
	private static String currentUser;

	public static void main(String[] args) {
		
		/* Hold alter-key here, and use arrow to comment out
		customer test = new customer();
		
		or hold alter-key here */
		
		setCurrentState(State.LOGIN);
		
		winMgr = new WindowManager();
		
		winMgr.RunLogin();
	}
	
	public static void changeState(State _state) {
		setCurrentState(_state);
		
		if (currentState == State.MAINPAGE) {
			winMgr.Run();
		}
		
		if (currentState == State.LOGIN) {
			winMgr.RunLogin();
		}
	}

	public static State getCurrentState() {
		return currentState;
	}

	private static void setCurrentState(State currentState) {
		Main.currentState = currentState;
	}

	public static String getCurrentUserName() {
		return currentUser;
	}

	public static void setCurrentUserName(String currentUserName) {
		Main.currentUser = currentUserName;
	}

	public enum State{
		SPLASHSCREEN,
		LOGIN,
		MAINPAGE		
	}
}
