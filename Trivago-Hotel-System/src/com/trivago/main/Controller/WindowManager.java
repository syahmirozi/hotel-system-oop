package com.trivago.main.Controller;

import java.awt.EventQueue;

import com.trivago.main.View.TrivagoGUI;

public class WindowManager {

	private TrivagoGUI gui;
	
	public WindowManager() {
		
	}
	
	
	public void Run() {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TrivagoGUI window = new TrivagoGUI();
				window.frame.setSize(1280, 720);
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}
	
}
