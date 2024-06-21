package day04;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
		int a = 1; //제어변수 - 반복문 횟수를 제어할 변수
		int sum = 0; //어떤 값을 누적시킬 변수 (반복문 밖에서 선언)
		
		while( a <= 10 ) {
			
		
			
			a++; //제어변수를 1증가 시켜서 반복조건이 언젠가 false 되도록 처리
			
		}
		
		System.out.println("누적합계:" + sum);
		
		System.out.println("반복문 종료!");
		
		/*
		 * int sum = 0;
		 * sum = sum + 1; //sum += a
		 * sum = sum + 2;
		 * sum = sum + 3;
		 * .......
		 * sum = sum + 10;
		 */
		
	}

}
