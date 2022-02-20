package com.trivago.main.Model;

public class Payment {

	private String paymentID;
	private String[] paymentType= {"Bank_In","E_Wallet","Cash","Credit_Card"};
	private Double payAmount;
	private String CurrentPaymentType;
	
	public Payment() {
		this.paymentID = "PAY0001";
		this.payAmount = 0.0;
	}
	
	public String getPaymentID() {
		return paymentID;
	}
	
	public Double getPayAmount() {
		return payAmount;
	}
	
	public boolean setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
		return true;
	}
	
	public void setCurrentPaymentType(String paymentType) {
		CurrentPaymentType = paymentType;
	}
	
	public String getCurrentPaymentType() {
		return CurrentPaymentType;
	}
	
}
