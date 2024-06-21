package day05;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		// 특정 조건까지 무한입력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("5 x 3 = ?");
			System.out.print(">");
			int num = scan.nextInt();
			
			if(num == 15) {
				System.out.println("정답입니다!");
				break; //반복문 탈출
			} else {
				System.out.println("틀렸습니다.");
			}
			
			// 입력받은 값이 조건에 만족하면 탈출
		}
	}
}
