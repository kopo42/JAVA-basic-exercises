package sw07;

public class ArrMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k42_Arr = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 121, 212, 33, 11, 21, 11, 2121, 121, 5, 6, 33};
		//������ ���� �迭 ����
		for(int k42_i = 0 ; k42_i < k42_Arr.length; k42_i++) { //�迭�� ���̸�ŭ �ݺ��Ѵ�
			System.out.printf("Array[%d] = %d\n", k42_i, k42_Arr[k42_i]); //�迭�� �� �׸� ����Ͽ� Ȯ��
		}
		int k42_Max = k42_Arr[0]; //�ִ�, �ּҰ��� �ʱⰪ�� �迭�� ù ������ ���Ƿ� �ʱ�ȭ�Ѵ�
		int k42_MaxP = 0; //�ִ�, �ּҰ��� ��ġ�� ������ ����
		int k42_Min = k42_Arr[0];
		int k42_MinP = 0;
		
		for(int k42_i = 0; k42_i < k42_Arr.length; k42_i++) {
			if(k42_Max < k42_Arr[k42_i]) { //���� ������ �ִ밪���� ū ���� �ִٸ�
				k42_Max = k42_Arr[k42_i]; //�ش� ���� �ִ밪 ������ �����Ѵ�
				k42_MaxP = k42_i; //�ش� ��ġ ����
			}
			if(k42_Min > k42_Arr[k42_i]) { //���������� �ּҰ����� ���� ���� �ִٸ�
				k42_Min = k42_Arr[k42_i]; //�ش� ���� �ּҰ� ������ ����
				k42_MinP = k42_i; //�ش� ��ġ ����
			}
		}
		System.out.printf("MAX : Array[%d] = %d\n", k42_MaxP, k42_Max);
		System.out.printf("MIN : Array[%d] = %d\n", k42_MinP, k42_Min);
	}
}
