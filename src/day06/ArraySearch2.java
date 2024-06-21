package day06;

import java.util.Arrays;

public class ArraySearch2 {
	
	public static void main(String[] args) {
		
		// 이진탐색 - 반반 분할해서 값을 찾아가는 방법
		// 조건 - 배열이 정렬이 되어있어야 함
		
		/*
		 * 1. 시작값 = 0, 끝값 = 배열의 마지막값 을 처음에 2개 배치
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는 값인지 확인
		 * 4. 중간값이 찾는 값보다 크면, end를 중간값 -1 내림
		 * 5. 중간값이 찾는 값보다 작으면, start를 중간값 +1 올림
		 * 반복 
		 * 반복의 중단조건, start와 end가 교차되면 끝
		 */
		
		int[] arr = {1,3,4,10,20,50,80,100};
		
		int find = 79;
		int start = 0; // 0번
		int end = arr.length - 1; // 7번
		
		while(start <= end) {
			int mid = (start + end) / 2; // 짝수, 홀수 상관없음

			if(arr[mid] == find) { // 찾음
				System.out.println("찾는 값은:" + mid + "번째 위치함");
				break; // 더 이상 값을 찾을 필요가 없음
			}
			
			if(arr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		// 못 찾음
		if(start > end) { 
			System.out.println(find + "는 없습니다");
		}
		
		// 이진 탐색 기능
		System.out.println( Arrays.binarySearch(arr, 80));
		// 음수가 나오면 값이 없다는 뜻
		// 양수가 나오면 해당 위치가 나옴
	}
}
