package sw07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_person = 5; //임의로 크기 지정
		OneRec []inData = new OneRec[k42_person]; //클래스 형태의 배열 생성
		
		inData[0] = new OneRec("student01", 100, 100, 90); //각 배열이 클래스 인스턴스 생성
		inData[1] = new OneRec("student02", 90, 90, 90);
		inData[2] = new OneRec("student03", 80, 70, 90);
		inData[3] = new OneRec("student04", 70, 60, 90);
		inData[4] = new OneRec("student05", 60, 100, 90);
		
		int k42_korsum = 0; int k42_engsum = 0; int k42_matsum = 0; //과목 합계가 저장될 변수
		int k42_kortotal = 0; int k42_engtotal = 0; int k42_mattotal = 0; //과목 누적 합계가 저장될 변수
		
		int k42_totalsum = 0; double k42_avgsum = 0; //총점, 평균 
		
		Calendar k42_cal = Calendar.getInstance(); //현재 시간 출력
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		int k42_page = 1; //페이지 저장할 변수
		int k42_i = 0; //반복문에 사용될 변수
		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%s%d", "PAGE: ", k42_page);
		System.out.printf("%30s%20s\n", "출력일자 :", k42_TIME);
		System.out.println("==========================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================================");
		//입력값 확인
		for(k42_i = 0; k42_i < k42_person; k42_i ++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.0f\n",
					String.format("%03d", k42_i+1), inData[k42_i].NAME(), inData[k42_i].KOR(), inData[k42_i].ENG(), 
					inData[k42_i].MAT(), inData[k42_i].SUM(), inData[k42_i].avg());
				k42_korsum += inData[k42_i].KOR(); //합계 구하기
				k42_engsum += inData[k42_i].ENG();
				k42_matsum += inData[k42_i].MAT();
				k42_totalsum += inData[k42_i].SUM();
				k42_avgsum += inData[k42_i].avg();
			} //inData[i].KOR(); 등으로 원하는 값의 리턴값을 받아온다
		System.out.println("==========================================================");
		System.out.println("현재 페이지");
		System.out.printf("%s\t\t\t%d\t%d\t%d\t%d\t%.0f\n", "합계", k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
		System.out.printf("%s\t\t\t%d\t%d\t%d\t%d\t%.0f\n", "평균",
					k42_korsum/k42_person, k42_engsum/k42_person, k42_matsum/k42_person,
					k42_totalsum/k42_person, k42_avgsum/k42_person);
		System.out.println("==========================================================");
	}
}
