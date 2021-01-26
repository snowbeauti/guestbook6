package com.java.num2;

import java.util.ArrayList;
import java.util.Scanner;

public class scustomerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고객정보를 입력하세요. (이름,가격)");
		ArrayList<Scustomer> sList= new ArrayList<Scustomer>(); 
		
		Scustomer s1 = new Scustomer();
		Scustomer s2 = new Scustomer();
		Scustomer s3 = new Scustomer();
		
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		
		
		
		for(int i=0; i<sList.size(); i++) {
			String info = sc.nextLine();
			String[] sArray = info.split(",");
			
			
			sList.get(i).setCustomerName(sArray[0]);
			sList.get(i).setPrice(sArray[1]);
		}
		
		for(int i=0; i<sList.size(); i++) {
			showInfo(sList.get(i));
		}
		
		sc.close();

	}

	private static void showInfo(Scustomer scustomer) {
		// TODO Auto-generated method stub
		
	}

}
