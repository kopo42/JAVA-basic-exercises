package sw06;

public class Calc1 {
	public int sum(int k42_a, int k42_b, int k42_c) { //매개변수 3개
		return k42_a + k42_b + k42_c;
	}
	public int sum(int k42_a, int k42_b, int k42_c, int k42_d) { //매개변수 4개
		return k42_a + k42_b + k42_c + k42_d;
	}
	public int sum(int k42_a, int k42_b, int k42_c, int k42_d, int k42_e) { //매개변수 5개
		return k42_a + k42_b + k42_c + k42_d + k42_e;
	}
	public double getAvg(int k42_a, int k42_b, int k42_c, int k42_d, int k42_e, int k42_cnt) {
		return sum(k42_a, k42_b, k42_c, k42_d, k42_e) / k42_cnt;
	}
	
	//매개변수 3개
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_sum, double k42_avg) {
		System.out.printf("%d월 성적표\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", //평균은 소수점 2자리까지 출력
				k42_name, k42_a, k42_b, k42_c, k42_sum, k42_avg);
		System.out.println("=============================================================="); //구분선
	}
	//매개변수 4개
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_d, int k42_sum, double k42_avg) {
		System.out.printf("%d월 성적표\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", //평균은 소수점 2자리까지 출력
				k42_name, k42_a, k42_b, k42_c, k42_d, k42_sum, k42_avg);
		System.out.println("=============================================================="); //구분선
	}
	//매개변수 5개
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_d, int k42_e, int k42_sum, double k42_avg) {
		System.out.printf("%d월 성적표\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t과학\t사회\t총점\t평균");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", //평균은 소수점 2자리까지 출력
				k42_name, k42_a, k42_b, k42_c, k42_d, k42_e, k42_sum, k42_avg);
		System.out.println("=============================================================="); //구분선
	}
	//성적 랜덤 지정하는 함수
	public int getRand() {
		int k42_rand = (int) (Math.random() * 50 + 50); //50~100사이의 임의로 정수로 출력
		return k42_rand; //랜덤값 반환
	}
}
