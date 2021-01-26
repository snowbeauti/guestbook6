package ListArray;

public class Multiplication {

	public static void main(String[] args) {
		int num1;
		int num2;
		/*
		 * for (num1 = 1; num1 < 10; num1++) { for (num2 = 1; num2 < 10; num2++) {
		 * System.out.println(num1 + "x" + num2 + "=" + num1 * num2); } }
		 */
		/*
		 * // 짝수단만 출력 for (num1 = 1; num1 < 10; num1++) { if (num1 % 2 == 0) {
		 * 
		 * for (num2 = 1; num2 < 10; num2++) { System.out.println(num1 + "x" + num2 +
		 * "=" + num1 * num2); }
		 * 
		 * } else { continue; } }
		 */

		// num1 >= num2
		for (num1 = 1; num1 < 10; num1++) {
			for (num2 = 1; num2 < 10; num2++) {
				if (num1 >= num2) {
					System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
				} else {
					break;
				}
			}
		}

	}

}
