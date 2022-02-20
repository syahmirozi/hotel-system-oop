package com.trivago.main.Controller;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

import com.trivago.main.View.*;

public class WindowManager {
	
	private ImageIcon logo = new ImageIcon("logo.png");
	
	public WindowManager() {
		
	}
	
	public void Run() {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TrivagoGUI window = new TrivagoGUI();
				window.frmHotelBookingSystem.setSize(1280, 720);
				window.frmHotelBookingSystem.setVisible(true);
				window.frmHotelBookingSystem.setLocationRelativeTo(null);
				window.frmHotelBookingSystem.setIconImage(logo.getImage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}
	
	public void RunLogin() {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TrivagoLoginPage window = new TrivagoLoginPage();
				window.setTitle("Login");
				window.setLocationRelativeTo(null);
				window.setIconImage(logo.getImage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}
	
	
	
}
