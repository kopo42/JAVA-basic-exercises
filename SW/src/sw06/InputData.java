package sw06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputData {
	int[] k42_num; String[]k42_name; int[]k42_kor; int[]k42_eng; int[]k42_mat; 
	int[]k42_sum; int[]k42_avg; //배열 선언부
	
	public InputData(int k42_person) { //받은 정수 (person) 크기를 가진 배열로 선언
		k42_num = new int[k42_person]; k42_name = new String[k42_person];
		k42_kor = new int[k42_person]; k42_eng= new int[k42_person]; k42_mat= new int[k42_person]; k42_sum= new int[k42_person];
		k42_avg = new int[k42_person];
	}
	public void SetData(int k42_i, String k42_str, int k42_score1, int k42_score2, int k42_score3) {
		///받은 변수들의 값에 따라 배열을 설정한다
		k42_num[k42_i] = k42_i; k42_name[k42_i] = k42_str;
		k42_kor[k42_i] = k42_score1; k42_eng[k42_i] = k42_score2; k42_mat[k42_i] = k42_score3;
		k42_sum[k42_i] = k42_kor[k42_i] + k42_eng[k42_i] + k42_mat[k42_i]; //합계
		k42_avg[k42_i] = k42_sum[k42_i] / 3; //평균
	}
	
	
//성적 랜덤 지정하는 함수
	public int getRand() {
		int k42_rand = (int) (Math.random() * 50 + 50); //50~100사이의 임의로 정수로 출력
		return k42_rand; //랜덤값 반환
	}
	//매개변수 3개
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_sum, double k42_avg) {
		Calendar k42_cal = Calendar.getInstance();
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		System.out.printf("%s", "성적집계표");
		System.out.printf("%s%s", "출력일자 :", k42_TIME);
		System.out.println("==============================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", //평균은 소수점 2자리까지 출력
				k42_name, k42_a, k42_b, k42_c, k42_sum, k42_avg);
		System.out.println("=============================================================="); //구분선
	}
	
	public int pageSum(int[]arr, int page, int n) {
		int sum = 0; //n = 30, 15
		int index = (30 * (page - 1)) + 1;
		for(int i = index; i <= n + (30 * (page - 1)); i++) {
			sum += arr[i];
		}
		return sum;
	} 
}
