package com.trivago.main.Model.Users;

public class Admin extends User{

	private String currentAdminRole;	
	
	public Admin() {
 
		hardCodeData = new String[][] {{"E101","Amirul","321","Amirul@gmail.com","Manager"},
			                      	   {"E102","Danial","123","Danial@gmail.com","AssistantManager"}};
			                      	   
	}
	
            
	public String getRole(int dataLocation) {
		return currentAdminRole;
    }
       
    public void setRole(String role) {
    	this.currentAdminRole = role;
    }
}