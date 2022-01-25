package com.trivago.main.View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TrivagoGUI {

	public JFrame frame;
	
	/**
	 * Create the application.
	 */
	public TrivagoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 835, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
