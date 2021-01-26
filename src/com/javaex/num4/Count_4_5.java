package com.javaex.num4;

import java.util.Scanner;

public class Count_4_5 {

	public static void main(String[] args) {
		//입력값부터 0까지 카운트다운 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			System.out.println(i);
		}
		
		
		sc.close();

	}

}
