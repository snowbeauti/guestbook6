package ListArray;

import java.util.Scanner;

public class Calcswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, -, x, /): ");
		sc.nextLine();
		String operator = sc.nextLine();
		sc.close();

		int result = 0;
		
		switch(operator) {
		case "+": result = num1+num2;
	         	break;
		case "-": result = num1-num2;
     	        break;
		case "x": result = num1*num2;
     	        break;
		case "/": result = num1/num2;
     	        break;
		}

		System.out.println("결과는 " + result +"입니다.");	

		
		
		
	}

}
