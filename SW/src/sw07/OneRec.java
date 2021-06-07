package sw07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OneRec {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public OneRec(String str, int score1, int score2, int score3) { //���� ���� (person) ũ�⸦ ���� �迭�� ����
		this.name = str; this.kor = score1; this.eng = score2; this.mat = score3;
	}
	
	public String NAME() {
		return this.name;
	}
	public int KOR() {
		return this.kor;
	}
	public int ENG() {
		return this.eng;
	}
	public int MAT() {
		return this.mat;
	}
	
	public int SUM() {
		return this.kor + this.eng + this.mat;
	}
	
	public double avg() {
		return this.SUM() / 3.0;
	}
	/*
	 * public void SetData(int k42_i, String k42_str, int k42_score1, int
	 * k42_score2, int k42_score3) { ///���� �������� ���� ���� �迭�� �����Ѵ� k42_num[k42_i] =
	 * k42_i; k42_name[k42_i] = k42_str; k42_kor[k42_i] = k42_score1; k42_eng[k42_i]
	 * = k42_score2; k42_mat[k42_i] = k42_score3; k42_sum[k42_i] = k42_kor[k42_i] +
	 * k42_eng[k42_i] + k42_mat[k42_i]; //�հ� k42_avg[k42_i] = k42_sum[k42_i] / 3;
	 * //��� }
	 */
	
//���� ���� �����ϴ� �Լ�
	public int getRand() {
		int k42_rand = (int) (Math.random() * 50 + 50); //50~100������ ���Ƿ� ������ ���
		return k42_rand; //������ ��ȯ
	}
	//�Ű����� 3��
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_sum, double k42_avg) {
		Calendar k42_cal = Calendar.getInstance();
		SimpleDateFormat k42_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		String k42_TIME = k42_sdf.format(k42_cal.getTime());
		System.out.printf("%s", "��������ǥ");
		System.out.printf("%s%s", "������� :", k42_TIME);
		System.out.println("==============================================================");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("==============================================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", //����� �Ҽ��� 2�ڸ����� ���
				k42_name, k42_a, k42_b, k42_c, k42_sum, k42_avg);
		System.out.println("=============================================================="); //���м�
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
