package interfacecalc;

import java.util.Scanner;

public class CalculatorApp {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("--------계산기를 실행합니다.---------");

		
		boolean end = true;

		while(true) {
			System.out.println("-------원하는 번호를 입력해주세요.-----");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");
			System.out.println("--------------------------------");

			Calculator calc = new Calculator();

			int number = sc.nextInt();
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력해주세요.");
			int num2 = sc.nextInt();
			sc.close();
			
			if(number == 1) {
				System.out.println(calc.add(num1, num2));
			} else if (number == 2) {
				System.out.println(calc.substract(num1, num2));
			} else if (number == 3) {
				System.out.println(calc.times(num1, num2));
			} else if (number == 4) {
				System.out.println(calc.divide(num1, num2));
			} else if (number == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println(Calc.ERROR);
			}
		
		}

	}

}
