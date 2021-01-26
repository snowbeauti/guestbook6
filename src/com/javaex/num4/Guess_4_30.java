package com.javaex.num4;

import java.util.Scanner;

public class Guess_4_30 {

	public static void main(String[] args) {
		// 숫자 맞추기 게임 0~99

		System.out.println("숫자맞추기게임 START");

		Scanner sc = new Scanner(System.in);
		int right = (int) (Math.random() * 99) + 0;

		int count = 0;
		int left = 10 - count;

		int num;

		do {
			System.out.println("숫자를 입력하세요." + left-- + "회 남았습니다.");
			num = sc.nextInt();

			if (num > right) {
				System.out.println("더 작은 숫자입니다.");
			} else if (num < right) {
				System.out.println("더 큰 숫자입니다.");
			}

		} while (num != right && left > 0);
		if (num == right) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("정답을 맞추지 못했습니다.");

			sc.close();

		}

	}
}
