package sw07;

import java.util.ArrayList;

public class OneRecList {
	private String k42_name;
	private int k42_studentID;
	private int k42_kor;
	private int k42_eng;
	private int k42_mat;
	
	public OneRecList(int k42_idnum, String k42_str, int k42_score1, int k42_score2, int k42_score3) { //받은 정수 (person) 크기를 가진 배열로 선언
		this.k42_name = k42_str; this.k42_kor = k42_score1; this.k42_eng = k42_score2; this.k42_mat = k42_score3;
		this.k42_studentID = k42_idnum;
	}//생성자
	public int STUDENTID() {//학번
		return this.k42_studentID;
	}
	public String NAME() {
		return this.k42_name;
	}
	public int KOR() {
		return this.k42_kor;
	}
	public int ENG() {
		return this.k42_eng;
	}
	public int MAT() {
		return this.k42_mat;
	}
	
	public double SUM() {//합계
		return this.k42_kor + this.k42_eng + this.k42_mat;
	}
	
	public double AVG() { //평균 더블형
		return this.SUM() / 3.0;
	}
}
