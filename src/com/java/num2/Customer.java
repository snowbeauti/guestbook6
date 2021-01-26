package com.java.num2;

public class Customer {
	
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint; //보너스 포인트
	double bonusRatio;//적립비율
	
	
	Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		 bonusPoint += price * bonusRatio;
		 // bonusPoint = bonusPoint + price * bonusRatio;(위와 같음 추가+)
		 return price;
	}
	
	public String showInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	

}
