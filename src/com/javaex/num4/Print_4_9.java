package com.javaex.num4;

import java.util.Scanner;

public class Print_4_9 {

	public static void main(String[] args) {
		// 자연수의 자릿수를 출력

		Scanner sc = new Scanner(System.in);

		
		System.out.println("자연수를 입력하세요.");
		
		int num = sc.nextInt();
		int result = 0;
				

		while (num>0) {
			result++;
			num /= 10;

		}

		System.out.println("입력한 숫자의 자리수는 " + result + "입니다.");

		sc.close();

	}

}
