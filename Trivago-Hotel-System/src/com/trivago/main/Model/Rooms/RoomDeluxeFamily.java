package com.trivago.main.Model.Rooms;

import javax.swing.ImageIcon;

public class RoomDeluxeFamily extends Room{

	public RoomDeluxeFamily() {
		super("R0004");
		
		roomType = "Deluxe Family";
		roomLevel = 2;
		roomPrice = 120.0;
		roomDetails = "Two queen size bed suitable for family.";
		roomAmount = 8;
		
		setRoomPicture(new ImageIcon("ImageHotel/DeluxeFamily.jpeg"));
	}

}
