package com.trivago.main.Model.Rooms;

import java.awt.Image;

import javax.swing.ImageIcon;

public class RoomApartment extends Room{

	private int numberOfRoomInApartment;
	private int[] roomLevels;
	
	public RoomApartment() {
		super("R0005");
		
		roomType = "Apartment";
		//apartment use roomLevels since it is in another block
		roomLevel = 0;
		setRoomLevels(new int[] {1,2,3});
		roomPrice = 340.0;
		roomDetails = "Get comfy in exclusive two bedroom apartment besides our hotel blocks. Suitable for family.";
		roomAmount = 6;
		
		setNumberOfRoom(2);
		
		addDateID("D2004");
		addDateID("D2005");
		
		setRoomPicture(new ImageIcon("ImageHotel/Apartment.jpg"));
	}

	public int getNumberOfRoom() {
		return numberOfRoomInApartment;
	}

	public void setNumberOfRoom(int numberOfRoomInApartment) {
		this.numberOfRoomInApartment = numberOfRoomInApartment;
	}

	public int[] getRoomLevels() {
		return roomLevels;
	}

	public void setRoomLevels(int[] roomLevels) {
		this.roomLevels = roomLevels;
	}
	
	

}
