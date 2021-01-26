package ListArray;

public class Study01 {
	public static void main(String[] args) {

		// 배열공부

		int[] student = new int[10]; // int 형 요소 10개인 배열 선언
		// 자료형[] 배열이름 = new 자료형[개수];

		int[] studentId = new int[] { 100, 101, 102 };
		// int형 요소가 3개인 배열 생성

		studentId[0] = 10; // 첫 배열에 요소 10을 저장

		//배열 1~10불러오기
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		//배열 1~10더하기
		int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //배열을 선언
		int sum = 0; //더하기 초기값을 지정
		
		for(int i =0; i<number.length; i++) {
			sum += number[i]; //더하기 최종값에 number 배열 값을 하나씩 더해주기
			
		}
		System.out.println(sum); //최종 더하기값을 출력
		
		
		int[] n = new int[] {10,20,30,40,50}; 
		int nsum = 0; 
		
		for(int i=0; i<n.length; i++) {
			nsum += n[i];
		}
		System.out.println(nsum);
		
	}

}