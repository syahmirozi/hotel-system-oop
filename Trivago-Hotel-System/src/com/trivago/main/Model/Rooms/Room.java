package com.trivago.main.Model.Rooms;

import javax.swing.ImageIcon;

public class Room {

	private String roomID;
	protected String roomType, roomDetails;
	protected Double roomPrice;
	protected int roomLevel;
	protected String[] dateIDStore = null;
	protected int roomAmount;
	
	protected ImageIcon roomImage;
	
	public boolean isFullyBookedThatDate;
	
	public Room(String roomID) {
		this.roomID = roomID;
		isFullyBookedThatDate = false;
	}
	
	
	
	public String getRoomID() {
		return roomID;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public String getRoomDetails() {
		return roomDetails;
	}
	
	public Double getRoomPrice() {
		return roomPrice;
	}
	
	public int getRoomLevel() {
		return roomLevel;
	}
	
	public void addDateID(String dateID) {
		if (dateIDStore == null) {
			dateIDStore = new String[] {dateID};
		}
		else {
			
			String[] temp = new String[dateIDStore.length + 1];
			for (int i = 0; i < temp.length; i++) {
				if (i == temp.length-1) {
					temp[i] = dateID;
				}
				else {
					temp[i] = dateIDStore[i];
				}
			}
			
			dateIDStore = temp;
		}
	}
	
	public String[] getDateIDStore() {
		return dateIDStore;
	}
	
	public int getRoomAmount(){
		return roomAmount;
	}
	
	public void editRoomAmount(int amount) {
		roomAmount += amount;
	}
	
	public ImageIcon getRoomPicture() {
		return roomImage;
	}
	
	public void setRoomPicture(ImageIcon roomImage) {
		this.roomImage = roomImage;
	}
	
}
