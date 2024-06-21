package day02;

public class OperateorEx05 {

	public static void main(String[] args) {
		
		//3항 연산식을 보기전에, 프로그램에서 랜덤값을 만드는 방법
		
//		double d = Math.random(); //랜덤한 실수를 돌려줌
//		System.out.println(d); //0이상 ~ 1미만 랜덤실수값
		
		
//이를 이용해서 여러 범위의 수들을 만들어 낼 수 있다. 
	
		
		int d = (int)(Math.random() * 10) + 1; //1~10
		System.out.println("랜덤수:" + d);
		
		//3항 연산식
		//조건 ? 연산1 : 연산2
		
		String result = d % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result);
		
		int n = (int)(Math.random() * 10000) + 1;
		System.out.println(n);
	}
	
}
