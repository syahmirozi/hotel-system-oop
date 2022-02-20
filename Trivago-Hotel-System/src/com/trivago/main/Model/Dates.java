package com.trivago.main.Model;

public class Dates {
	
	private String[][] bookedDate;
	private String dateID, checkIn, checkOut;
	

	public Dates() {
		
		bookedDate = new String[][] {{"D2001","15/03/2022", "17/03/2022"},
			 						 {"D2002","15/03/2022", "16/03/2022"},
			 						 {"D2003","15/03/2022", "20/03/2022"},
			 						 {"D2004","16/03/2022", "17/03/2022"},
			 						 {"D2005","16/03/2022", "18/03/2022"}};
		
		dateID = null;
		checkIn = null;
		checkOut = null;
		
	}
	
	public void addDate(String[] newDate) {
		
		int currentSize = bookedDate.length;
		
		bookedDate[currentSize][0] = newDate[0];
		bookedDate[currentSize][1] = newDate[1];
		bookedDate[currentSize][2] = newDate[2];
	}
	
	public String[][] getBookedDate(){
		return bookedDate;
	}

	public String getDateID() {
		return dateID;
	}
	
	public void setDateID(String dateID) {
		this.dateID = dateID;
	}
	
	public String getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	
	public String getCheckOut() {
		return checkOut;
	}
	
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
}
