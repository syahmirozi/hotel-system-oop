package com.trivago.main.Model.Rooms;

import javax.swing.ImageIcon;

public class RoomDoubleBed extends Room{

	public RoomDoubleBed() {
		super("R0002");
		
		roomType = "Double Bed";
		roomLevel = 1;
		roomPrice = 85.0;
		roomDetails = "Double bed room suitable for two persons.";
		roomAmount = 14;
		
		addDateID("D2002");
		
		setRoomPicture(new ImageIcon("ImageHotel/DoubleBed.jpeg"));
	}

}
