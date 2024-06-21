package day05;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue; // 아래 i를 출력하는 실행문을 실행하지 않고 바로 반복문의 다음으로 넘어간다.
			}
			
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		// continue도 중첩에서 이름붙이기 됨
		int i = 1;
		while(i <= 10) {

			if(i == 5){
				i++;
				continue; // 반복문의 다음으로 넘어가기에 i++를 만나지 못하고 무한 반복에 갇힘 i++을 조건문에 넣어주면 해결됨
			}
			
			System.out.println(i);
			i++;
		}
		
	}

}
