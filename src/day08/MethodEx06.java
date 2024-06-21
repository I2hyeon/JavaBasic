package day08;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		// Queue - First In First Out (FIFO)
		
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop() + " -> ");
		System.out.print( pop());
			
	}
	
	static int[] arr = {};
	
	static void push(int data) {
		
		// 1. 배열크기 + 1
		// int[] temp = new int[arr.length + 1];
		// 2. 배열 복사
		int[] temp = Arrays.copyOf(arr, arr.length + 1); // 배열명, 복사할 길이
		// 3. 마지막에 데이터를 추가
		temp[temp.length - 1] = data;
		// 4. 원본배열 변경
		arr = temp;
		temp = null;
	}
	
	static int pop() {
		// 삭제가 가능한 조건 안에서
		// 1. 삭제할 데이터 백업
		// 2. 길이 - 1 배열 생성
		// 3. 배열의 1번째 요소 ~ 마지막까지 복사
		// 4. 원본 배열을 변경
		// 5. 삭제된 데이터를 반환 1 -> 2 -> 3 .... -> 8
		
		
		if(arr.length > 0) {
			int data = arr[0];
			int[] temp = new int[arr.length - 1];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1]; 
			}
			
	// int[] temp = Arrays.copyOfRange(arr, 1, arr.length-1); // 복사할 배열, 시작 위치, 끝 위치
			
			arr = temp;
			temp = null;
		
			return data;
		}
			return 0;
	}

}
