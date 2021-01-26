package ListArray;

public class Calc {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == 'X') {
			result = num1 * num2;
		} else if (operator == '/') {
			if (num2 == 0) {
				System.out.println("error");
			} else {
				result = num1 / num2;
			}
		}
		System.out.println("결과는 " + result +"입니다.");
	}

}
