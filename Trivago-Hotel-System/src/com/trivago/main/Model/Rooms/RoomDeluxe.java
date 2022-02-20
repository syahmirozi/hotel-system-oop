package com.trivago.main.Model.Rooms;

import javax.swing.ImageIcon;

public class RoomDeluxe extends Room{

	public RoomDeluxe() {
		super("R0003");
		
		roomType = "Deluxe";
		roomLevel = 2;
		roomPrice = 90.0;
		roomDetails = "Queen size bed suitable for couples/two persons.";
		roomAmount = 10;
		
		addDateID("D2003");
		
		setRoomPicture(new ImageIcon("ImageHotel/Deluxe.jpeg"));
	}

}
