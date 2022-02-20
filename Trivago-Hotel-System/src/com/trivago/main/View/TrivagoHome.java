package com.trivago.main.View;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;

public class TrivagoHome extends JPanel{

	private static final long serialVersionUID = -5002372287483579525L;
	
	private TrivagoGUI mainFrame;
	private JTextField textField;
	
	
	public TrivagoHome(TrivagoGUI trivagoMain) {
		
		mainFrame = trivagoMain;
		setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		
		Dimension d = null;
		try {
			d = mainFrame.displayPanel.getSize();
		} catch (Exception e) {
			System.out.println("Error when parsing ");
		}
		
		if (d != null) {
			setSize(d);
		}
		
		JPanel panelSearch = new JPanel();
		panelSearch.setBackground(SystemColor.textInactiveText);
		panelSearch.setForeground(SystemColor.menu);
		add(panelSearch, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setDropMode(DropMode.INSERT);
		panelSearch.add(textField);
		textField.setColumns(20);
	}
	
}
