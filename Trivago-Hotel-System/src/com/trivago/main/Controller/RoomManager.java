package com.trivago.main.Controller;

import java.util.ArrayList;

import com.trivago.main.Model.Rooms.Room;
import com.trivago.main.Model.Rooms.RoomApartment;
import com.trivago.main.Model.Rooms.RoomDeluxe;
import com.trivago.main.Model.Rooms.RoomDeluxeFamily;
import com.trivago.main.Model.Rooms.RoomDoubleBed;
import com.trivago.main.Model.Rooms.RoomSingleBed;

public class RoomManager {

	//properties
	private ArrayList<Room> roomList;
	
	//controller
	private BookingManager bookingManager;
	
	//model
	public Room singleRoom = new RoomSingleBed();
	public Room doubleRoom = new RoomDoubleBed();
	public Room deluxeRoom = new RoomDeluxe();
	public Room familyRoom = new RoomDeluxeFamily();
	public Room apartmentRoom = new RoomApartment();
	
	public RoomManager(BookingManager bookingManager) {
		this.bookingManager = bookingManager;
		
		setRoomList(new ArrayList<Room>());

		roomList.add(singleRoom);
		roomList.add(doubleRoom);
		roomList.add(deluxeRoom);
		roomList.add(familyRoom);
		roomList.add(apartmentRoom);
		
	}
	
	public BookingManager getRoomBookingManager() {
		return this.bookingManager;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
}
