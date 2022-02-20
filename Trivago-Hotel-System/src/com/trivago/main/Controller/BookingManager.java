package com.trivago.main.Controller;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;

import com.trivago.main.Model.*;
import com.trivago.main.Model.Rooms.Room;
import com.trivago.main.View.TrivagoBooking;

public class BookingManager {
	
	//properties
	private String bookingID;
	private String currentRoomName;
	private ArrayList<Room> roomList;
	private DecimalFormat df = new DecimalFormat("0.00");
	
	private DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
	private Date date = new Date();
	private Calendar calendar = Calendar.getInstance();
	
	//model
	public Dates bookingDate;
	public Payment makePayment;
	
	//controller
	public RoomManager roomManager;
	
	//view
	public TrivagoBooking bookingPage;
	
	public BookingManager(TrivagoBooking bookingPage) {
		
		this.bookingPage = bookingPage;
		
		bookingID = generateBookingID();
		
		double amountPay = 0;
		
		bookingDate = new Dates();
		makePayment = new Payment();
		
		roomManager = new RoomManager(this);
	}
	
	public void makeBooking(String currentRoomName) {
				
	}
	
	public void bookRoom(String roomID) {
		
	}
	
	public void checkAvailability(String roomType, String checkIn, String checkOut) {
		
		boolean isDateAvailable = checkDate(roomType, checkIn, checkOut);
		
		if (isDateAvailable) {
			displayAllAvailableRoom(roomType);
		}
		
	}
	
	private void displayAllAvailableRoom(String roomType) {
		Object[] data = null;
		String[] cols = {"Room", "Amount", "Details", "Price"};
		ImageIcon roomImage = null;
		try {
			
			if (roomList == null) {
				roomList = roomManager.getRoomList();
			}
			
			for (Room room : roomList) {
				if(room.getRoomType() == roomType) {
					data = new Object[] {room.getRoomType(), room.getRoomAmount(), room.getRoomDetails(), room.getRoomPrice()};
					roomImage = room.getRoomPicture();
					break;
				}
			}
			
			bookingPage.displayAvailableRoom(roomImage, data, cols);
			
		}catch(Exception e) {
			
			System.out.println("Error occured at:\n\n" + e.getMessage());
			
		}
		
	}

	private boolean checkDate(String roomType, String checkIn, String checkOut) {
		boolean isAvailable = false;
		
		String[][] tempDateStore = bookingDate.getBookedDate();
		String[] bookedDateID = new String[10]; //set to 10 because know date is lower than 10
		int count = 0;
		
		for(String[] checkDateData: tempDateStore) {
			if (checkDateData[1].equals(checkIn) && checkDateData[2].equals(checkOut)) {
				bookedDateID[count++] = checkDateData[0];
			}
		}
		
		roomList = roomManager.getRoomList();
		
		for(Room room: roomList) {
			if (room.getRoomType() == roomType && room.getDateIDStore() != null) {
				for (String dateID: room.getDateIDStore()) {
					
					for(String foundDateID: bookedDateID) {
						if (dateID.equals(foundDateID)) {
							room.editRoomAmount(-1);
						}
					}
					
					if (room.getRoomAmount() > 0) {
						isAvailable = true;
						room.isFullyBookedThatDate = false;
					}
					else {
						isAvailable = false;
						room.isFullyBookedThatDate = true;
					}
				}
				break;
			}
			else if (room.getRoomType() == roomType && room.getDateIDStore() == null) {
				isAvailable = true;
				room.isFullyBookedThatDate = false;
				break;
			}
		}
		
		return isAvailable;
	}
	public boolean makePayment(Double amount) {
		
		boolean isPaid = false;
		
		isPaid = makePayment.setPayAmount(amount);
		
		return isPaid;
	}
	
	public void choosePaymentType(String type) {
		makePayment.setCurrentPaymentType(type);
	}
	
	private String generateBookingID() {
		
		return "B001";
		
	}

}
