package com.trivago.main.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TrivagoGUI implements ActionListener{

	public JFrame frmHotelBookingSystem;
	public JPanel displayPanel;
	public JMenuBar menuBar;
	
	private JMenu menuHome;
	private JMenu menuRoom;
	private JMenu menuBooking;
	private JPanel panelHeaderCenter;
	private JMenu menuLogin;
	private JMenu menuSignUp;
	
	private JMenuItem menuRoomSingle;
	private JMenuItem menuRoomDoubleBed;
	private JMenuItem menuRoomDeluxe;
	private JMenuItem menuRoomDeluxeFamily;
	private JMenuItem menuRoomApartment;
	private JMenuItem menuRoomPenthouse;
	
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
		frmHotelBookingSystem = new JFrame();
		frmHotelBookingSystem.setTitle("Hotel Booking System");
		frmHotelBookingSystem.setResizable(false);
		frmHotelBookingSystem.setBounds(100, 100, 835, 570);
		frmHotelBookingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayPanel = new JPanel();
		displayPanel.setBorder(null);
		displayPanel.setBackground(new Color(255, 255, 255));
		displayPanel.setSize(1280, 350);
		frmHotelBookingSystem.getContentPane().add(displayPanel, BorderLayout.NORTH);
		displayPanel.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		frmHotelBookingSystem.setJMenuBar(menuBar);
		
		//adding Menu in Menu Bar
		menuHome = new JMenu("Home");
		menuBar.add(menuHome);
		menuHome.addActionListener(this);
		
		menuRoom = new JMenu("Room");
		menuBar.add(menuRoom);
		
		menuBooking = new JMenu("Booking");
		menuBar.add(menuBooking);
		menuBooking.addActionListener(this);
		
		panelHeaderCenter = new JPanel();
		panelHeaderCenter.setBackground(SystemColor.menu);
		menuBar.add(panelHeaderCenter);
		panelHeaderCenter.setLayout(new BorderLayout(0, 0));
		
		menuLogin = new JMenu("Login");
		menuBar.add(menuLogin);
		menuLogin.addActionListener(this);
		
		menuSignUp = new JMenu("Sign Up");
		menuBar.add(menuSignUp);
		menuSignUp.addActionListener(this);
		
		
		//adding MenuItem into each Room Menu
		menuRoomSingle = new JMenuItem("Single Room");
		menuRoomDoubleBed = new JMenuItem("Double Single Bed Room");
		menuRoomDeluxe = new JMenuItem("Deluxe Room");
		menuRoomDeluxeFamily = new JMenuItem("Deluxe Family Room");
		menuRoomApartment = new JMenuItem("Apartment");
		menuRoomPenthouse = new JMenuItem("Penthouse");
		
		menuRoom.add(menuRoomSingle);
		menuRoom.add(menuRoomDoubleBed);
		menuRoom.add(menuRoomDeluxe);
		menuRoom.add(menuRoomDeluxeFamily);
		menuRoom.add(menuRoomApartment);
		menuRoom.add(menuRoomPenthouse);
		
	}
	
	public void setDisplayPanel(JPanel _panel) {
		
		if (displayPanel != null) {
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
