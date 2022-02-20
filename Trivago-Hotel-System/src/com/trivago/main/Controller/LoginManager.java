package com.trivago.main.Controller;

import com.trivago.main.Main;
import com.trivago.main.Model.Users.*;
import com.trivago.main.View.*;

public class LoginManager {

	private User currentUser;
	private String userType;
	
	public LoginManager(String userType) {
		this.userType = userType;
		
		if(this.userType == "Customer") {
			currentUser = null;
			currentUser = new Customer();
		}
		else if(this.userType == "Admin") {
			currentUser = null;
			currentUser = new Admin();
		}
		
	}
		
	public boolean checkAuthentication(String UserName, String UserPassword) {
		boolean isAuthenticate = false;
		
		String[][] userData = currentUser.gethardCodeData();
		
		for(String[] row:userData) {
			String tempId = row[0];
		    String tempPwd = row[2];
		    
		    System.out.println("ID: " + tempId + "  Password: " + tempPwd);
		    
		    if(tempId.equals(UserName) && tempPwd.equals(UserPassword)) {
		    	setAsCurrentUser(row);
		    	Main.setCurrentUserName(currentUser.getUserName());
		    	isAuthenticate = true;
		    	break;
		    }
		}
		
		return isAuthenticate;
	}
	
	//{"A101","Aiman","1234","No 24 Jalan Tun Abdul Razak,Johor Bahru","0112211715","Aiman@gmail.com"}

	private void setAsCurrentUser(String[] row) {
		if(this.userType == "Customer") {
			Customer tempUser = new Customer();
			tempUser.setUserId(row[0]);
			tempUser.setUserName(row[1]);
			tempUser.setUserPassword(row[2]);
			tempUser.setAddress(row[3]);
			tempUser.setContactNo(row[4]);
			tempUser.setUserEmail(row[5]);
			currentUser = tempUser;
			
		}
		else if(this.userType == "Admin") {
			Admin tempUser = new Admin();
			tempUser.setUserId(row[0]);
			tempUser.setUserName(row[1]);
			tempUser.setUserPassword(row[2]);
			tempUser.setUserEmail(row[3]);
			tempUser.setRole(row[4]);
			currentUser = tempUser;
		}
	}
	
}
