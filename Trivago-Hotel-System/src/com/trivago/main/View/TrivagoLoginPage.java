package com.trivago.main.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import com.trivago.main.Main;
import com.trivago.main.Main.State;
import com.trivago.main.Controller.LoginManager;
import com.trivago.main.Controller.WindowManager;

public class TrivagoLoginPage extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6923536630166058016L;

	private JTextField textName = new JTextField(15);
	
	private LoginManager loginManager;
	private JPasswordField passwordField;
	
	private JPanel inputPanel;
	private JPanel buttonPanel;
	
	private JLabel labelWelcome;
	private final JButton btnLogin = new JButton("Login");
	private final JToggleButton btnToggleAdmin = new JToggleButton("Admin");
	private final JToggleButton btnToggleCust = new JToggleButton("Customer");

	
	public TrivagoLoginPage() {
		this.loginManager = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login Page");
		setSize(600, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Container pane = getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		
		JPanel panelHeader = new JPanel();
		panelHeader.setBackground(new Color(30, 144, 255));
		panel.add(panelHeader, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		panelHeader.add(splitPane);
		
		
		inputPanel = new JPanel();
		inputPanel.show(false);
		inputPanel.setBackground(Color.WHITE);
		panel.add(inputPanel, BorderLayout.CENTER);
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[]{105, 59, 86, 40, 0, 95, 0};
		gbl_inputPanel.rowHeights = new int[]{28, 4, 20, 0, 0, 0};
		gbl_inputPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_inputPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		labelWelcome = new JLabel("Welcome, USER");
		GridBagConstraints gbc_labelWelcome = new GridBagConstraints();
		gbc_labelWelcome.insets = new Insets(0, 0, 5, 5);
		gbc_labelWelcome.gridx = 0;
		gbc_labelWelcome.gridy = 1;
		inputPanel.add(labelWelcome, gbc_labelWelcome);
		
		JLabel label = new JLabel("Enter ID:");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		inputPanel.add(label, gbc_label);
		GridBagConstraints gbc_textName = new GridBagConstraints();
		gbc_textName.anchor = GridBagConstraints.NORTHWEST;
		gbc_textName.insets = new Insets(0, 0, 5, 5);
		gbc_textName.gridx = 2;
		gbc_textName.gridy = 3;
		textName.setFont(new Font("Consolas", Font.PLAIN, 11));
		inputPanel.add(textName, gbc_textName);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 4;
		gbc.gridy = 3;
		JLabel label_1 = new JLabel("Enter password: ");
		inputPanel.add(label_1, gbc);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Consolas", Font.PLAIN, 11));
		passwordField.setEchoChar('*');
		passwordField.setColumns(15);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.anchor = GridBagConstraints.NORTHWEST;
		gbc_passwordField.gridx = 5;
		gbc_passwordField.gridy = 3;
		inputPanel.add(passwordField, gbc_passwordField);
		passwordField.addKeyListener(this);
		
		pane.add(panel);
		
		buttonPanel = new JPanel();
		buttonPanel.show(false);
		buttonPanel.setBackground(Color.WHITE);
		panel.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(btnLogin);
		btnLogin.addActionListener(this);
		btnToggleAdmin.setBackground(Color.WHITE);
		
		splitPane.setLeftComponent(btnToggleAdmin);
		btnToggleAdmin.addActionListener(this);
		btnToggleCust.setBackground(Color.WHITE);
		
		splitPane.setRightComponent(btnToggleCust);
		btnToggleCust.addActionListener(this);
	}
	
	
	private void changeToAdmin() {
		boolean isSelected = btnToggleAdmin.isSelected();
		
		btnToggleAdmin.setSelected(!isSelected);
		btnToggleCust.setSelected(isSelected);
		
		if(loginManager != null) {
			loginManager = null;
		}

		
		inputPanel.show();
		buttonPanel.show();
		loginManager = new LoginManager("Admin");
		labelWelcome.setText("Welcome, Admin");
		System.out.println("Changed To Admin");
	}
	
	private void changeToCustomer() {
		boolean isSelected = btnToggleCust.isSelected();
		
		btnToggleAdmin.setSelected(isSelected);
		btnToggleCust.setSelected(!isSelected);
		
		if(loginManager != null) {
			loginManager = null;
		}
		
		inputPanel.show();
		buttonPanel.show();
		loginManager = new LoginManager("Customer");
		labelWelcome.setText("Welcome, Customer");
		System.out.println("Changed to Customer");
	}
	
	private void loginUser() {
		boolean isAllowed = false;
		
		String userName = textName.getText();
		String userPassword = passwordField.getText().toString();
		System.out.println("Usermame Entered: " + userName);
		System.out.println("Password Entered: " + userPassword);
		System.out.println("Login Button Clicked");
		isAllowed = loginManager.checkAuthentication(userName, userPassword);
		
		if(isAllowed) {
			System.out.println("Correct");
			/*
			 * Change state here
			 */
			
			Main.changeState(State.MAINPAGE);
			this.dispose();
		}
		else {
			System.out.println("Incorrect!!");
			JOptionPane.showMessageDialog(this, "Username or Password is incorrect!\nPlease try again.");
			
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		Object o = e.getSource();
		
		if(o == btnToggleAdmin) {
			
			changeToAdmin();
		}
		
		if(o == btnToggleCust) {
			
			changeToCustomer();
		}
		
		
		if(o == btnLogin) {
			loginUser();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER){
			loginUser();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
