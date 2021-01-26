package com.java.num2;

public class Vip {
private int customerID;
private String customerName;
private String customerGrade;
int bonusPoint;
double bonusRatio;
private int agentID;
double saleRatio;

public Vip() {
	customerGrade = "VIP";
	bonusRatio = 0.05;
	saleRatio = 0.1;
}

public int calcPrice(int price) {
	bonusPoint += price * bonusRatio;
	return price - (int)(price * saleRatio);
	
}

public int getAgentID() {
	return agentID;
}
public String showInfo() {
	return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
}

}
