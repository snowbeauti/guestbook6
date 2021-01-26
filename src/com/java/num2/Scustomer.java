package com.java.num2;

public class Scustomer {
	private String customerName;
	private String customerGrade;
	double discountRate;
	double reserveRate;
	private int reservePoint;
	int price;
	
	public Scustomer() {
		customerGrade = "VIP";
		discountRate = 0.1;
		reserveRate = 5;
		
	}
	
	
	
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerGrade() {
		return customerGrade;
	}



	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}



	public double getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}



	public double getReserveRate() {
		return reserveRate;
	}



	public void setReserveRate(double reserveRate) {
		this.reserveRate = reserveRate;
	}



	public int getReservePoint() {
		return reservePoint;
	}



	public void setReservePoint(int reservePoint) {
		this.reservePoint = reservePoint;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int buy(int price) {
	price *= (1 - discountRate) / 100; 
	return price;
	}
	
	public double point(int price) {
	reservePoint = (int) (price * reserveRate);
	return reservePoint;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + ", 결제금액은 " + price + ", 적립금은 " + reservePoint + "입니다.";
	}



	public void setPrice(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//전문상담원?

	

}
