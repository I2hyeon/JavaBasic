package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산시에도 형변환이 일어납니다.
		char c = 'A';
		int i = 2;
		
		
		//연산에서의 형변환
		//1. int보다 작은 타입의 연산은 무조건 int가 됩니다.
		
		System.out.println(c + i);
		char cc = (char)(c + i); //결과가 int(정수)라서 저장이 안 됨, 캐스팅을 해줘야 한다. 연산에 괄호를 칠 것.
		
		byte b1 = 3;
		byte b2 = 5;
		//byte b3 = b1 + b2(x) -> int가 됨
		
		//2. int보다 큰 타입의 연산은 큰 타입을 따라가게 됩니다.
		int k = 3;
		double d = 3.14;
		
		System.out.println(k + d); //6.14
		
		
		
	}
	
}
