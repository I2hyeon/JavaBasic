package day03;

public class IfEx01 {
	
	public static void main(String[] args) {
		
		//0~100까지 랜덤한 점수 생성
		
		int point = (int)(Math.random() * 101); 
		
		System.out.println("랜덤한 점수:" + point);
		
		String grade; //변수를 사용하겠다는 선언을 밖에서 한 후
		
		if(point >= 60) {
			System.out.println("합격 입니다!");
			grade = "A";//변수값을 지정해주면 됨
			
		} else {
			System.out.println("불합격 입니다!");
			grade = "F";
		}
		
		System.out.println("당신의 등급은:" + grade + "입니다");
		
		
	
		
	}

}
