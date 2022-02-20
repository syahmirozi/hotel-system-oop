package com.trivago.main.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import com.trivago.main.Controller.BookingManager;

import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JTextPane;

public class TrivagoBooking extends JPanel implements ActionListener {

	private JPanel panelMain;
	
	public JPanel panelDisplayImage;
	
	private JDateChooser dateCheckIn;
	private JDateChooser dateCheckOut;
	private JComboBox comboBox;
	private JComboBox boxRoomSelect;
	private JButton btnCheckAvailability;
	private JButton btnMakeBooking;
	
	private JLabel lblImage;
	private JLabel labelRoomType;
	private JLabel lblRoomAmount;
	private JTextPane lblRoomDetails;
	private JLabel lblPrice;
	
	private boolean choosenRoomDisplayed;
	
	private BookingManager bookingManager;
	
	private DecimalFormat df = new DecimalFormat("0.00");
	
	@SuppressWarnings("unchecked")
	public TrivagoBooking(TrivagoGUI trivagoMain) {
		bookingManager = new BookingManager(this);
		
		choosenRoomDisplayed = false;
		
		setLayout(new BorderLayout(0, 0));
		
		panelMain = new JPanel();
		panelMain.setBackground(new Color(0, 102, 255));
		add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);
		
		JLabel labelCheckIn = new JLabel("Check In : ");
		labelCheckIn.setBounds(198, 100, 77, 13);
		labelCheckIn.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		panelMain.add(labelCheckIn);
		labelCheckIn.setHorizontalAlignment(SwingConstants.LEFT);
		labelCheckIn.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JLabel labelCheckOut = new JLabel("Check Out : ");
		labelCheckOut.setBounds(447, 100, 84, 13);
		labelCheckOut.setHorizontalAlignment(SwingConstants.LEFT);
		labelCheckOut.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		labelCheckOut.setAlignmentX(0.5f);
		panelMain.add(labelCheckOut);
		
		JLabel labelNumPeople = new JLabel("Person : ");
		labelNumPeople.setBounds(447, 169, 63, 13);
		labelNumPeople.setHorizontalAlignment(SwingConstants.LEFT);
		labelNumPeople.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		labelNumPeople.setAlignmentX(0.5f);
		panelMain.add(labelNumPeople);
		
		dateCheckIn = new JDateChooser();
		dateCheckIn.setBounds(198, 121, 202, 20);
		panelMain.add(dateCheckIn);
		
		dateCheckOut = new JDateChooser();
		dateCheckOut.setBounds(447, 121, 202, 20);
		panelMain.add(dateCheckOut);
		
		Integer[] number = {0,1,2,3,4,5,6,7,8,9,10,11,12};
		comboBox = new JComboBox(number);
		comboBox.setBounds(573, 164, 70, 23);
		panelMain.add(comboBox);
		
		btnCheckAvailability = new JButton("Check Availability");
		btnCheckAvailability.setBounds(667, 142, 154, 23);
		btnCheckAvailability.setBackground(Color.LIGHT_GRAY);
		btnCheckAvailability.setForeground(new Color(0, 0, 0));
		panelMain.add(btnCheckAvailability);
		btnCheckAvailability.addActionListener(this);
		
		panelDisplayImage = new JPanel();
		panelDisplayImage.setBounds(136, 212, 481, 273);
		panelMain.add(panelDisplayImage);
		panelDisplayImage.setLayout(new BorderLayout(0, 0));
		
		lblImage = new JLabel("Image Here");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelDisplayImage.add(lblImage);
		
		JLabel labelRoomSelect = new JLabel("Choose Room : ");
		labelRoomSelect.setHorizontalAlignment(SwingConstants.LEFT);
		labelRoomSelect.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		labelRoomSelect.setAlignmentX(0.5f);
		labelRoomSelect.setBounds(198, 152, 120, 13);
		panelMain.add(labelRoomSelect);
		
		boxRoomSelect = new JComboBox(new String[] {"Single Bed", "Double Bed", "Deluxe", "Deluxe Family","Apartment"});
		boxRoomSelect.setBounds(198, 169, 202, 23);
		panelMain.add(boxRoomSelect);
		
		JPanel panelDisplayRoomInfo = new JPanel();
		panelDisplayRoomInfo.setBounds(627, 212, 257, 273);
		panelMain.add(panelDisplayRoomInfo);
		panelDisplayRoomInfo.setLayout(new BoxLayout(panelDisplayRoomInfo, BoxLayout.Y_AXIS));
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBackground(Color.WHITE);
		panelDisplayRoomInfo.add(verticalStrut_1);
		
		labelRoomType = new JLabel("Room Type Here");
		labelRoomType.setForeground(Color.BLUE);
		labelRoomType.setFont(new Font("Script MT Bold", Font.PLAIN, 27));
		labelRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		labelRoomType.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelDisplayRoomInfo.add(labelRoomType);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panelDisplayRoomInfo.add(verticalStrut);
		
		lblRoomAmount = new JLabel("Room Available :");
		lblRoomAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomAmount.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		lblRoomAmount.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelDisplayRoomInfo.add(lblRoomAmount);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		panelDisplayRoomInfo.add(verticalStrut_3);
		
		lblRoomDetails = new JTextPane();
		lblRoomDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoomDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRoomDetails.setText("Room details will be display in here. It just a simple description about the room.");
		panelDisplayRoomInfo.add(lblRoomDetails);
		
		Component verticalGlue = Box.createVerticalGlue();
		panelDisplayRoomInfo.add(verticalGlue);
		
		lblPrice = new JLabel("RM 0");
		lblPrice.setForeground(new Color(0, 204, 255));
		lblPrice.setFont(new Font("Consolas", Font.PLAIN, 36));
		lblPrice.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelDisplayRoomInfo.add(lblPrice);
		
		btnMakeBooking = new JButton("Book Now");
		btnMakeBooking.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelDisplayRoomInfo.add(btnMakeBooking);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		panelDisplayRoomInfo.add(verticalStrut_2);
		btnMakeBooking.addActionListener(this);
		
		JPanel panelFooter = new JPanel();
		add(panelFooter, BorderLayout.SOUTH);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBackground(new Color(0, 204, 255));
		add(panelHeader, BorderLayout.NORTH);
		
		JLabel labelHeader = new JLabel("Reservation Page");
		labelHeader.setFont(new Font("Verdana", Font.BOLD, 18));
		panelHeader.add(labelHeader);
		
		JPanel panelLeft = new JPanel();
		add(panelLeft, BorderLayout.WEST);
		
		JPanel panelRight = new JPanel();
		add(panelRight, BorderLayout.EAST);
		
		
	}
	
	public void displayAvailableRoom(ImageIcon roomImage, Object[] data, String[] cols) {
		lblImage.setText("");
		lblImage.setIcon(resizeImage(roomImage));
		labelRoomType.setText((String) data[0]);
		lblRoomAmount.setText("Room Available : " + data[1]);
		lblRoomDetails.setText((String) data[2]);
		lblPrice.setText("RM " + df.format(data[3]));
		choosenRoomDisplayed = true;
	}
	
	private ImageIcon resizeImage(ImageIcon imageToResize) {
		
		Image preImage = imageToResize.getImage();
		Image resizedImage = preImage.getScaledInstance(480, 260, Image.SCALE_SMOOTH);
		return new ImageIcon(resizedImage);
	}
	
	private void checkChoosenOption() {
		String tempRoomType = (String) boxRoomSelect.getSelectedItem();
		Date tempCheckIn = dateCheckIn.getDate();
		Date tempCheckOut = dateCheckOut.getDate();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
		
		boolean allDetailsEntered = true;
		
		if (tempCheckIn.after(tempCheckOut)) {
			System.out.print("Error date");
			JOptionPane.showMessageDialog(this, "Please select check-in date before check-out date.");
			allDetailsEntered = false;
		}
		else if(tempCheckOut.before(tempCheckIn)) {
			System.out.print("Error date");
			JOptionPane.showMessageDialog(this, "Please select check-out date after check-in date.");
			allDetailsEntered = false;
		}
		
		if (comboBox.getSelectedIndex() <= 0) {
			System.out.print("Person cannot be zero");
			JOptionPane.showMessageDialog(this, "Please select how many guests to check-in.");
			allDetailsEntered = false;
		}
		
		System.out.println("\nChecking availability");
		System.out.println("Room Type: " + tempRoomType);
		System.out.println("Room Check In: " + sdf.format(tempCheckIn));
		System.out.println("Room Check Out: " + sdf.format(tempCheckOut));
		System.out.println("Guests: " + comboBox.getSelectedIndex());
		
		if (allDetailsEntered) {
			bookingManager.checkAvailability(tempRoomType, sdf.format(tempCheckIn), sdf.format(tempCheckOut));
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		
		if(obj.equals(btnCheckAvailability)) {
			checkChoosenOption();
		}
		
		if(obj.equals(btnMakeBooking)){
			if (choosenRoomDisplayed) {
				int opt = JOptionPane.showConfirmDialog(this, "Are you sure you want to make a reservation", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
				System.out.println("This value was choosen: " + opt);
				if (opt == 0) {
					System.out.println("Proceed to Payment");
				}
			}
			
		}
	}
}
