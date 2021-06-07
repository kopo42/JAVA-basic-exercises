package sw07;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrEx3();
	}
	public static void ArrEx1() {
		int[] k42_Array = {1, 3, 5, 7, 9}; //선언과 동시에 초기화
		for(int k42_i = 0; k42_i < 5; k42_i ++) {
			System.out.printf("Array[%d] = %d\n", k42_i, k42_Array[k42_i]);
		}
		k42_Array[5] = 11; //배열 크기 범위 외의 값 지정 시 오류 발생
	}
	public static void ArrEx2() {
		ArrayList k42_list = new ArrayList(); //타입은 지정하지 않고 리스트 생성
		
		k42_list.add("abc"); k42_list.add("abcd"); k42_list.add("efga"); k42_list.add("가나다라0");
		k42_list.add("1234"); k42_list.add("12rk34"); 
		//list.add(356); //문자열만 입력 중 숫자 입력시 오류 발생
		
		System.out.println("===========================");
		System.out.printf("Start of ArraySize %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.set(3, "가라라라"); //3의 내용 변경
		System.out.println("===========================");
		System.out.printf("Element Edited %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.remove(4); //4를 삭제
		System.out.println("===========================");
		System.out.printf("Element Edited %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.sort(null); //정렬하기
		System.out.println("===========================");
		System.out.printf("Lsit Sorted %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.clear(); //리스트 삭제
		System.out.println("===========================");
		System.out.printf("ArrayList Cleared, ArraySize %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
	}
	
	public static void ArrEx3() {
		int k42_max = 1000000; //임의의 큰 값 지정
		ArrayList k42_list = new ArrayList(); //타입 없이 선언
		
		for(int k42_i = 0; k42_i < k42_max; k42_i++) {
			k42_list.add((int)(Math.random() * 1000000)); //1000000까지의 난수 지정
		}
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i++) {
			System.out.printf("ArrayList %d = %d\n", k42_i, k42_list.get(k42_i));
		}
		System.out.println("===========================");
		k42_list.sort(null); //정렬하기
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %d\n", k42_i, k42_list.get(k42_i));
		}
	}
}
