package com.javaex.num4;

import java.util.Scanner;

public class Plus_4_15 {

	public static void main(String[] args) {
		// 1부터 n까지 합 구하기

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result =0;
		
		for(int i = 0; i<num; i++) {
			System.out.print(i + "+");
			result += i;
		}
		System.out.println(num);
		System.out.println(result+num);
		
		sc.close();
	}

}
