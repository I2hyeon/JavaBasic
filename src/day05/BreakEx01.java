package day05;

public class BreakEx01 {
	public static void main(String[] args) {
		
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 주로 사용하고,
		 * 	 While(true) 문장을 많이 사용합니다
		 */
		
		int i = 1;
		while(true) {
			if(i == 15) {
				break; //가장 가까운 반복문 1개를 빠져나옵니다
			}
			System.out.println(1);
			i++;
		}
	}

}
