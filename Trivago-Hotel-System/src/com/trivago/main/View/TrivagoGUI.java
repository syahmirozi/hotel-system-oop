package com.trivago.main.View;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.trivago.main.Main;
import com.trivago.main.Controller.LoginManager;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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
	
	private CardLayout card;
	
	//panel list
	private TrivagoHome homePanel;
	private TrivagoBooking bookingPanel;
	
	//menu
	private JMenu menuHome;
	private JMenu menuRoom;
	private JMenu menuBooking;
	private JPanel panelHeaderCenter;
	private JMenu menuUser;
	
	//room list
	private JMenuItem menuRoomSingle;
	private JMenuItem menuRoomDoubleBed;
	private JMenuItem menuRoomDeluxe;
	private JMenuItem menuRoomDeluxeFamily;
	private JMenuItem menuRoomApartment;
	private JMenuItem menuHomePanel;
	private JMenuItem menuBookingPanel;
	
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
		frmHotelBookingSystem.setBounds(100, 100, 731, 505);
		frmHotelBookingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayPanel = new JPanel();
		displayPanel.setBorder(null);
		displayPanel.setBackground(new Color(255, 255, 255));
		displayPanel.setSize(720, 500);
		frmHotelBookingSystem.getContentPane().add(displayPanel, BorderLayout.CENTER);
		
		card = new CardLayout();
		displayPanel.setLayout(card);
		
		//initialize all main panel
		homePanel = new TrivagoHome(this);
		bookingPanel = new TrivagoBooking(this);
		
		//add all panel
		displayPanel.add(homePanel, "homePanel");
		displayPanel.add(bookingPanel, "bookingPanel");
		
		//display main panel
		card.show(displayPanel, "homePanel");
		
		menuBar = new JMenuBar();
		frmHotelBookingSystem.setJMenuBar(menuBar);
		
		//adding Menu in Menu Bar
		menuHome = new JMenu("Menu");
		menuBar.add(menuHome);
		
		menuHomePanel = new JMenuItem("Home Page");
		menuHome.add(menuHomePanel);
		menuHomePanel.addActionListener(this);
		
		menuRoom = new JMenu("Room");
		menuBar.add(menuRoom);
		
		menuBooking = new JMenu("Booking");
		menuBar.add(menuBooking);
		
		menuBookingPanel = new JMenuItem("Make Reservation");
		menuBooking.add(menuBookingPanel);
		menuBookingPanel.addActionListener(this);
		
		panelHeaderCenter = new JPanel();
		panelHeaderCenter.setBackground(SystemColor.menu);
		menuBar.add(panelHeaderCenter);
		panelHeaderCenter.setLayout(new BorderLayout(0, 0));
		
		
		
		menuUser = new JMenu("Welcome, " + Main.getCurrentUserName());
		menuBar.add(menuUser);
		menuUser.addActionListener(this);
		
		
		//adding MenuItem into each Room Menu
		menuRoomSingle = new JMenuItem("Single Room");
		menuRoomDoubleBed = new JMenuItem("Double Single Bed Room");
		menuRoomDeluxe = new JMenuItem("Deluxe Room");
		menuRoomDeluxeFamily = new JMenuItem("Deluxe Family Room");
		menuRoomApartment = new JMenuItem("Apartment");
		
		menuRoom.add(menuRoomSingle);
		menuRoom.add(menuRoomDoubleBed);
		menuRoom.add(menuRoomDeluxe);
		menuRoom.add(menuRoomDeluxeFamily);
		menuRoom.add(menuRoomApartment);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Object obj = arg0.getSource();
		
		if (obj.equals(menuHomePanel)) {
			card.show(displayPanel, "homePanel");
			System.out.println("Home button clicked!");
		}
		
		if (obj.equals(menuBookingPanel)) {
			card.show(displayPanel, "bookingPanel");
			System.out.println("Booking button clicked! \nGoing to booking page");
		}
		
	}
	
}
