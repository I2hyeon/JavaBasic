package day02;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//입력
		//1. 스캐너를 생성
		Scanner Scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 활용해서 데이터를 입력받음
		System.out.print("너 이름이 뭐야?>");
		String name = Scan.next(); //공백 앞까지 문자열을 받음
		
		System.out.print("너 나이가 몇이야?>");
		int age = Scan.nextInt(); //정수를 입력받음
		
		System.out.print("신장은 어떻게 되세요?>");
		double cm = Scan.nextDouble(); //실수를 입력받음
		
		//nextLine과 다른 입력구문을 사용하면, 입력이 무시되고 넘어가는 경우가 있는데, 
		System.out.print("자기소개>");
		Scan.nextLine(); //위에서 남아있는 엔터값을 소모 (nextLine 엔터값을 소모)
		String intro = Scan.nextLine(); //공백포함한 문자열을 받음
		
		System.out.println("너의 이름은:" + name + ", 나이는:" + age);
		System.out.println("키:" + cm);
		System.out.println("자기소개:" + intro);
		
		//3. 스캐너 종료
		Scan.close();
		
		
	}

}