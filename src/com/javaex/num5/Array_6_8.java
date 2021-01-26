package com.javaex.num5;

import java.util.Scanner;

public class Array_6_8 {

	public static void main(String[] args) {
		// 특정 값을 가지는 요소 찾기

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 개수: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			int x = sc.nextInt();
			a[i] = x;
		}

		System.out.print("찾을 숫자: ");
		int x = sc.nextInt();

		int i;
		for (i = n - 1; i >= 0; i--) {
			if (a[i] == x) {
				break;
			}
		}
		if (i >= 0) {
			System.out.println("값은 a[" + i + "]에 있습니다.");
		} else {
			System.out.println("값이 존재하지 않습니다.");

		}

		sc.close();
	}

}
