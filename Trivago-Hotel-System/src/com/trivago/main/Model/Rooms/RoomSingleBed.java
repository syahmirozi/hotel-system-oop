package com.trivago.main.Model.Rooms;

import javax.swing.ImageIcon;

public class RoomSingleBed extends Room{

	public RoomSingleBed() {
		super("R0001");
		
		roomType = "Single Bed";
		roomLevel = 1;
		roomPrice = 60.0;
		roomDetails = "Single bed room suitable for solo traveler.";
		roomAmount = 14;
		
		addDateID("D2001");
		
		setRoomPicture(new ImageIcon("ImageHotel/SingleBed.jpeg"));
	}

}
