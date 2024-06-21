package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자
		
		//산술연산 + - * / %
		
		int i = 7 / 3;
		int j = 7 % 3;
		int k = 7 * 3;
		
		System.out.println("i는:" + i); //2 몫
		System.out.println("j는:" + j); //1 나머지
		System.out.println("k는" + k); //21
		
		//비교연산자 >=, >, ==, !=
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i >= j); //t
		System.out.println(i <= j); //f
		System.out.println(i < j); //f
		System.out.println( k % 2 == 0); //true라면 짝수
		System.out.println( k % 2 != 0); //true라면 홀수
		System.out.println( k % 5 == 0); //true라면 5의 배수
		
		System.out.println("------------------------------");
		
		//비트연산자
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println( a & b ); //0000 0001 둘 다 1이면 1, 아니면 0
		System.out.println( a | b ); //0000 0111 두 비트 중 하나만 1이어도 1
		System.out.println( a ^ b ); //0000 0110 같으면 0, 다르면 1
		
		//비트 쉬프트 >>, <<
		int num = 192; //1100 0000
		System.out.println( num >> 2 ); //오른쪽으로 2칸
		System.out.println( num << 2 ); //왼쪽으로 2칸
		
	}
}
