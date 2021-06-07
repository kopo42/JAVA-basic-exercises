package sw07;

public class ArrMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k42_Arr = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 121, 212, 33, 11, 21, 11, 2121, 121, 5, 6, 33};
		//임의의 정수 배열 선언
		for(int k42_i = 0 ; k42_i < k42_Arr.length; k42_i++) { //배열의 길이만큼 반복한다
			System.out.printf("Array[%d] = %d\n", k42_i, k42_Arr[k42_i]); //배열의 각 항목 출력하여 확인
		}
		int k42_Max = k42_Arr[0]; //최대, 최소값의 초기값은 배열의 첫 항으로 임의로 초기화한다
		int k42_MaxP = 0; //최대, 최소값의 위치를 저장할 변수
		int k42_Min = k42_Arr[0];
		int k42_MinP = 0;
		
		for(int k42_i = 0; k42_i < k42_Arr.length; k42_i++) {
			if(k42_Max < k42_Arr[k42_i]) { //임의 저장한 최대값보다 큰 값이 있다면
				k42_Max = k42_Arr[k42_i]; //해당 값을 최대값 변수에 저장한다
				k42_MaxP = k42_i; //해당 위치 저장
			}
			if(k42_Min > k42_Arr[k42_i]) { //마찬가지로 최소값보다 작은 값이 있다면
				k42_Min = k42_Arr[k42_i]; //해당 값을 최소값 변수에 저장
				k42_MinP = k42_i; //해당 위치 저장
			}
		}
		System.out.printf("MAX : Array[%d] = %d\n", k42_MaxP, k42_Max);
		System.out.printf("MIN : Array[%d] = %d\n", k42_MinP, k42_Min);
	}
}
