package sw07;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrEx3();
	}
	public static void ArrEx1() {
		int[] k42_Array = {1, 3, 5, 7, 9}; //����� ���ÿ� �ʱ�ȭ
		for(int k42_i = 0; k42_i < 5; k42_i ++) {
			System.out.printf("Array[%d] = %d\n", k42_i, k42_Array[k42_i]);
		}
		k42_Array[5] = 11; //�迭 ũ�� ���� ���� �� ���� �� ���� �߻�
	}
	public static void ArrEx2() {
		ArrayList k42_list = new ArrayList(); //Ÿ���� �������� �ʰ� ����Ʈ ����
		
		k42_list.add("abc"); k42_list.add("abcd"); k42_list.add("efga"); k42_list.add("�����ٶ�0");
		k42_list.add("1234"); k42_list.add("12rk34"); 
		//list.add(356); //���ڿ��� �Է� �� ���� �Է½� ���� �߻�
		
		System.out.println("===========================");
		System.out.printf("Start of ArraySize %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.set(3, "������"); //3�� ���� ����
		System.out.println("===========================");
		System.out.printf("Element Edited %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.remove(4); //4�� ����
		System.out.println("===========================");
		System.out.printf("Element Edited %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.sort(null); //�����ϱ�
		System.out.println("===========================");
		System.out.printf("Lsit Sorted %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
		k42_list.clear(); //����Ʈ ����
		System.out.println("===========================");
		System.out.printf("ArrayList Cleared, ArraySize %d\n", k42_list.size());
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %s\n", k42_i, k42_list.get(k42_i));
		}
		
	}
	
	public static void ArrEx3() {
		int k42_max = 1000000; //������ ū �� ����
		ArrayList k42_list = new ArrayList(); //Ÿ�� ���� ����
		
		for(int k42_i = 0; k42_i < k42_max; k42_i++) {
			k42_list.add((int)(Math.random() * 1000000)); //1000000������ ���� ����
		}
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i++) {
			System.out.printf("ArrayList %d = %d\n", k42_i, k42_list.get(k42_i));
		}
		System.out.println("===========================");
		k42_list.sort(null); //�����ϱ�
		for(int k42_i = 0; k42_i < k42_list.size(); k42_i ++) {
			System.out.printf("ArrayList %d = %d\n", k42_i, k42_list.get(k42_i));
		}
	}
}
