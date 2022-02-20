package com.trivago.main.Model.Users;

public class User {
	private String UserId;
	private String UserName;
	private String UserPassword;
	private String UserEmail;
	protected String[][] hardCodeData;
	
	
	public User() {

	}
	
	
	public String getUserId() {
		return UserId;
    }
       
    public void setUserId(String id) {
    	this.UserId = id;
    }
       
    public String getUserName() {
        return UserName;
    }
       
    public void setUserName(String name) {
        this.UserName = name;
    }
      
    public String getUserPassword() {
        return UserPassword;
    }
      
    public void setUserPassword(String pwd) {
        this.UserPassword = pwd;
    }
      
    public String getUserEmail() {
        return UserEmail;
    }
    
    public void setUserEmail(String mail) {
        this.UserEmail = mail;
    }
	 
    public String [][] gethardCodeData(){
    	return this.hardCodeData;
    }
}
