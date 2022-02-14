package com.trivago.main.Controller;

import java.awt.EventQueue;

import com.trivago.main.View.TrivagoGUI;
import com.trivago.main.View.TrivagoHome;

public class WindowManager {
	
	public WindowManager() {
		
	}
	
	
	public void Run() {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TrivagoGUI window = new TrivagoGUI();
				window.frmHotelBookingSystem.setSize(1280, 720);
				window.frmHotelBookingSystem.setVisible(true);
				window.displayPanel = new TrivagoHome(window);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}
	
}
