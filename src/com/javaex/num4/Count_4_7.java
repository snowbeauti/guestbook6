package com.javaex.num4;

import java.util.Scanner;

public class Count_4_7 {
	
	public static void main(String[] args) {
		//입력한 숫자만큼 *출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 *을 표기할까요?");
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {
			System.out.print("*");
		}
		
		System.out.println("");
		
		
		System.out.println("몇개의 *+을 표기할까요?");
		int num2 = sc.nextInt();
		
		for(int i=num2/2; i>0; i--) {
			System.out.print("*+");
		}
		if(num2 % 2 == 1) {
			System.out.print("*");
		} 
		
		sc.close();
		
	}

}
