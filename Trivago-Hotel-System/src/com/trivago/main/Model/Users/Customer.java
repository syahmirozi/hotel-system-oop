package com.trivago.main.Model.Users;

public class Customer extends User{

	private String custAddress;
	private String custContactNo;	
	
	public Customer() {
		hardCodeData = new String[][] {{"A101","Aiman","1234","No 24 Jalan Tun Abdul Razak,Johor Bahru","0112211715","Aiman@gmail.com"},
	                                  {"A102","Ashraf","123","8 Jln Harilela Taman Harilela,Ipoh","05-3131777","Ashraf@gmail.com"},
	                                  {"A103","Chong","1443","Sek. U2/j, Taman Ttdi Jaya,Shah Alam","0116915814","Chong@gmail.com"}};
	
	/*for(String[] row:hardCodeData) {
		   String tempId = row[0];
	       String tempPwd = row[2];
				                   		  
			}
		 */
	}

    public String getAddress() {
    	return custAddress;
    }
       
    public void setAddress(String addres) {
        this.custAddress = addres;
    }
      
    public String getContactNo() {
        return custContactNo;
    }
    
    public void setContactNo(String connum) {
        this.custContactNo = connum;
    }
    
    @Override
    public String getUserId() {
    	return super.getUserId();
    }
    
    @Override
    public void setUserId(String id) {
    	super.setUserId(id);
    }
    
    @Override
    public String getUserName() {
    	return super.getUserName();
    }
    
    @Override
    public void setUserName(String name) {
    	super.setUserName(name);
    }
    
    @Override
    public String getUserPassword() {
    	return super.getUserPassword();
    }
    
    @Override
    public void setUserPassword(String pwd) {
    	super.setUserPassword(pwd);
    }
    
    @Override
    public String getUserEmail() {
    	return super.getUserEmail();
    }
    
    @Override
    public void setUserEmail(String mail) {
    	super.setUserEmail(mail);
    }
}
