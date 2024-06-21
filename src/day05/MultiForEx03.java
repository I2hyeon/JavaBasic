package day05;

import day01.SystemOut;

public class MultiForEx03 {
	public static void main(String[] args) {
		
		// 바깥의 반복횟수에 따라서 다르게 회전하는 반복문
		
//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j);
//			}
//			
//		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
//		int star = 5;
//		for(int i = 1; i <= star; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println(); // 줄바꿈
//			
//		}
//		
//		System.out.println("---------------------------");
//		
		/*
		 * ***** 1행 5번 = 합이 6
		 * ****  2행 4번 = 합이 6 ..
		 * *** 	 3행 3번
		 * **    4행 2번
		 * *	 5행 1번
		 */
		
//		for(int i = 1; i <= star; i++) { // 행
//			for(int j = 1; j <= star+1-i; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println(); // 줄바꿈
//		}	
		
//		for(int i = 1; i <= star; i++) { // 행
//			
//			for(int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
//		
		
		/*
		 * 별을 찍기 전에 공백을 출력
		 * 바깥 반복문 - 행
		 * 내부 반복문 - 출력
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		
		int star = 5;
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		System.out.println("---------------------------");
		
		
		/*
		 *      *
		 *     *** 
		 *    *****
		 *   *******
		 *  *********   
		 */
		
		int star2 = 5;
		for(int i = 1; i <= star2; i++) {
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			for(int p = 1; p <= 2*i - 1; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
