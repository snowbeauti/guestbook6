package com.javaex.num5;

import java.util.Scanner;

public class Array_6_6 {

	public static void main(String[] args) {
		// 요소 개수와 요소값을 받아 표기하자

		Scanner sc = new Scanner(System.in);

		System.out.print("요소개수: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		if (n >= 1) {
			for (int i = 0; i < n; i++) {
				System.out.print("a[" + i + "]=");
				int x = sc.nextInt();
				a[i] = x;
			}

			System.out.print("a={");
			for (int i = 0; i < n - 1; i++) {
				System.out.print(a[i] + ",");
			}
			System.out.print(a[n - 1]);
			System.out.println("}");
		} else {
			System.out.println("유효하지 않습니다.");
		}
		// 한글버전 안되네

		System.out.println("");
		System.out.print("요소개수: ");
		int N = sc.nextInt();

		String[] w = new String[N];
		if (N >= 1) {
			for (int i = 0; i < N; i++) {
				System.out.print("w[" + i + "]=");
				sc.next();
				String x = sc.nextLine();
				w[i] = x;
			}

			System.out.print("w={");
			for (int i = 0; i < N - 1; i++) {
				System.out.print(w[i] + ",");
			}
			System.out.print(w[N - 1]);
			System.out.println("}");
		} else {
			System.out.println("유효하지 않습니다.");
		}
		sc.close();
	}

}
