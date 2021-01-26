package com.javaex.num4;

import java.util.Scanner;

public class Same {
	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자 두개를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a==b) {
			System.out.println("두값이 같습니다.");
		} else {
			max = a>b ? a : b;
			min = a>b ? b : a; 
			System.out.println("작은 값은" + min + "입니다.");
			System.out.println("작은 값은" + max + "입니다.");
		}

		sc.close();
	}

}
