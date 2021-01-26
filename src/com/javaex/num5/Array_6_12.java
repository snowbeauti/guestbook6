package com.javaex.num5;

import java.util.Scanner;

public class Array_6_12 {

	public static void main(String[] args) {
		// 요소개수에 따른 난수배열 중복x

		Scanner sc = new Scanner(System.in);
		System.out.print("요소 개수: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int x = (int) (Math.random() * 10) + 1;
			a[i] = x;

			for (int b = 0; b < i; b++) {
				if (a[i] == a[b]) {
					i--;
				}
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

		sc.close();

	}

}
