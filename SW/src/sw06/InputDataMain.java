package sw06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_person = 45; //임의로 크기 지정
		InputData inData = new InputData(k42_person + 1); //직관적인 크기로 배열을 설정하기 위함
		for(int k42_i = 0; k42_i < k42_person + 1; k42_i++) {
			String k42_name = String.format("홍길%02d", k42_i); //이름 입력
			int k42_kor = inData.getRand(); //성적 난수 입력
			int k42_eng = inData.getRand(); //성적 난수 입력
			int k42_mat = inData.getRand(); //성적 난수 입력
			inData.SetData(k42_i, k42_name, k42_kor, k42_eng, k42_mat); //외부 클래스 내의 객체 사용
		}
		int k42_korsum = 0; int k42_engsum = 0; int k42_matsum = 0; //과목 합계가 저장될 변수
		int k42_kortotal = 0; int k42_engtotal = 0; int k42_mattotal = 0; //과목 누적 합계가 저장될 변수
		
		int k42_totalsum = 0; int k42_avgsum = 0; //총점, 평균 
		int k42_sum_totalsum = 0; int k42_sum_avgsum = 0; //누적 총점, 평균
		
		Calendar k42_cal = Calendar.getInstance(); //현재 시간 출력
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		int k42_page = 1; //페이지 저장할 변수
		int k42_index = 0; //번호 출력 및 배열 위치 지정
		int k42_i = 0; //반복문에 사용될 변수
		int k42_cnt = 0; //출력된 회수를 저장할 변수
		while(k42_index < k42_person) { //임의의 입력값 크기 내에서
			if(k42_index % 30 == 1) { //head, tail = 30번마다 한번씩 출력
				System.out.printf("%25s\n", "성적집계표");
				System.out.printf("%s%d", "PAGE: ", k42_page);
				System.out.printf("%30s%20s\n", "출력일자 :", k42_TIME);
				System.out.println("==========================================================");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("==========================================================");
				
				//입력값 확인
				for(k42_i = k42_index; k42_i < 30 + k42_index; k42_i ++) {
					System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\n",
							String.format("%03d", k42_i), inData.k42_name[k42_i], inData.k42_kor[k42_i], inData.k42_eng[k42_i], 
							inData.k42_mat[k42_i], inData.k42_sum[k42_i], inData.k42_avg[k42_i]);
					k42_cnt++; //출력 회수 저장
					if(k42_i == k42_person) { //배열 크기에 다다르면 반복 종료
						break;
					}
				}
				int k42_cntforavg = (k42_i - 30*(k42_page - 1)); //해당 페이지의 항목 개수
				
				k42_korsum = inData.pageSum(inData.k42_kor, k42_page, k42_cntforavg); //해당 페이지에서만 계산하기 위해 외부 클래스 사용
				k42_engsum = inData.pageSum(inData.k42_eng, k42_page, k42_cntforavg);
				k42_matsum = inData.pageSum(inData.k42_mat, k42_page, k42_cntforavg);
				
				k42_totalsum = inData.pageSum(inData.k42_sum, k42_page, k42_cntforavg); //총점의 합계
				k42_avgsum = inData.pageSum(inData.k42_avg, k42_page, k42_cntforavg); //평균의 합계
				
				k42_sum_totalsum += k42_totalsum; //누적 페이지 합계
				k42_sum_avgsum += k42_avgsum; //누적 페이지 평균
				k42_kortotal += k42_korsum; k42_engtotal += k42_engsum; k42_mattotal += k42_matsum; //누적 페이지 과목 합계
				System.out.println("==========================================================");
				System.out.println("현재 페이지");
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "합계", k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "평균",
						k42_korsum/k42_cntforavg, k42_engsum/k42_cntforavg, k42_matsum/k42_cntforavg,
						k42_totalsum/k42_cntforavg, k42_avgsum/k42_cntforavg);
				
				System.out.println("==========================================================");
				System.out.println("누적 페이지");
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "합계", k42_kortotal, k42_engtotal, k42_mattotal, k42_sum_totalsum, k42_sum_avgsum);
				System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%d\n", "평균",
						k42_kortotal/k42_person, k42_engtotal/k42_person, k42_mattotal/k42_person,
						k42_sum_totalsum/k42_person, k42_sum_avgsum/k42_person);	
				System.out.println("==========================================================");	
				k42_page++; //다음 페이지
			}
			k42_index++;
		}
	}
}
