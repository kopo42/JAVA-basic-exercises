package sw07;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class OneRecListMain {
	static int k42_person = 100; //임의로 크기 지정
	static ArrayList<OneRecList> ArrayOneRec = new ArrayList<OneRecList>(); //리스트로 선언
	static int k42_korsum = 0; static int k42_engsum = 0; static int k42_matsum = 0; //과목 합계가 저장될 변수
	static int k42_kortotal = 0; static int k42_engtotal = 0; static int k42_mattotal = 0; //과목 누적 합계가 저장될 변수
	static int k42_totalsum = 0; static double k42_avgsum = 0; //총점, 평균
	static int k42_sum_totalsum = 0; static double k42_sum_avgsum = 0; //누적 총점, 평균
	
	public static void main(String[] args) { //메인 함수
		int k42_page = 1;
		int k42_index = 0;
		int k42_i = 0;
		dataSet(); //데이터 세팅 함수
		dataSort(); //데이터 정렬
		
		 while(k42_index < k42_person) { //임의의 입력값 크기 내에서 
				 if(k42_index % 30 == 1) {//head, tail = 30번마다 한번씩 출력 
					HeaderPrint(k42_page); 
					for(k42_i = k42_index; k42_i < 30 + k42_index; k42_i ++) {
					 itemPrint(k42_i, k42_page); 
						 if(k42_i == k42_person) { //배열 크기에 다다르면 반복 종료 
							 break; 
						 }
					}
				int cnt  = (k42_i - 30 * (k42_page - 1));
				 k42_sum_totalsum += k42_totalsum; //누적 페이지 합계 
				 k42_sum_avgsum += k42_avgsum;//누적 페이지 평균 
				 k42_kortotal += k42_korsum; 
				 k42_engtotal += k42_engsum;
				 k42_mattotal += k42_matsum; //누적 페이지 과목 합계 
				 TailPrint(k42_i, k42_page, cnt); 
				 k42_page ++;
			 }
			k42_korsum = 0; k42_engsum = 0; k42_matsum = 0; //다음 반복으로 넘어갈 때 초기화
			k42_totalsum = 0; k42_avgsum = 0; //static variables
			 k42_index++;	 
		 }
	}
	public static void dataSet() {
		for(int k42_i = 0; k42_i < k42_person + 1; k42_i++) { //지정한 크기 내 반복
			 String k42_name = String.format("student%02d", k42_i); //임의 지정
			 int k42_kor = 2; //성적 난수 지정
			 int k42_eng = (int) (Math.random() * 50 + 50);
			 int k42_mat = (int) (Math.random() * 50 + 50);
			 ArrayOneRec.add(new OneRecList(k42_i, k42_name, k42_kor, k42_eng, k42_mat)); //형식대로 입력
			 //하나의 클래스 생성 후 리스트에 추가
		}
	}
	public static void HeaderPrint(int k42_page) { //헤더 출력
		Calendar k42_cal = Calendar.getInstance(); //현재 시간 출력
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		System.out.printf("%30s\n", "성적집계표");
		System.out.printf("%s%d", "PAGE: ", k42_page);
		System.out.printf("%30s%20s\n", "출력일자 :", k42_TIME);
		System.out.println("==============================================================");
		System.out.println("번호\t       이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================================");
	}
	
	public static void itemPrint(int k42_i, int k42_page) { //내용 출력
		OneRecList rec;
		rec = ArrayOneRec.get(k42_i); //클래스 선언 및 초기화 //i번째 학생의 정보 출력
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", //평균 소수점 지정 출력
				rec.STUDENTID(), rec.NAME(), rec.KOR(), rec.ENG(), rec.MAT(), (int)(rec.SUM()), rec.AVG());
		pageSum(rec, k42_i, k42_page);
	}
	
	public static void TailPrint(int k42_i, int k42_page, int cnt) { //꼬리말 출력
		int totalcnt = cnt + (30 * (k42_page - 1));
		System.out.println(totalcnt);
		System.out.println("==============================================================");
		System.out.println("현재 페이지");
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "합계", 
				k42_korsum, k42_engsum, k42_matsum, k42_totalsum, k42_avgsum);
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "평균",
				k42_korsum/cnt, k42_engsum/cnt, k42_matsum/cnt,
				k42_totalsum/cnt, k42_avgsum/cnt);
		System.out.println("==========================================================");
		System.out.println("누적 페이지");
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "합계", 
				k42_kortotal, k42_engtotal, k42_mattotal, k42_sum_totalsum, k42_sum_avgsum);
		System.out.printf("%s\t\t%d\t%d\t%d\t%d\t%.2f\n", "평균",
				k42_kortotal/totalcnt, k42_engtotal/k42_person, k42_mattotal/k42_person,
				k42_sum_totalsum/k42_person, k42_sum_avgsum/k42_person);	
	}
	public static void pageSum(OneRecList rec, int k42_i, int k42_page) { //계산 부분
		int n  = (k42_i - 30 * (k42_page - 1));//n = 30, 15
		k42_korsum += rec.KOR(); k42_engsum += rec.ENG(); k42_matsum += rec.MAT();
		k42_totalsum += rec.SUM(); k42_avgsum += rec.AVG(); //static variables
		
	} 
	public static void dataSort() {
		Comparator<OneRecList> listorder = new Comparator<OneRecList>() {
			public int compare(OneRecList k42_a1, OneRecList k42_a2) { //사용자가 설정한 내용대로 정렬한다
				return (int) (k42_a2.SUM() - k42_a1.SUM());
			}
		};
		Collections.sort(ArrayOneRec, listorder); //역정렬시 reverse 사용
	}
}
