package sw06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputData {
	int[] k42_num; String[]k42_name; int[]k42_kor; int[]k42_eng; int[]k42_mat; 
	int[]k42_sum; int[]k42_avg; //�迭 �����
	
	public InputData(int k42_person) { //���� ���� (person) ũ�⸦ ���� �迭�� ����
		k42_num = new int[k42_person]; k42_name = new String[k42_person];
		k42_kor = new int[k42_person]; k42_eng= new int[k42_person]; k42_mat= new int[k42_person]; k42_sum= new int[k42_person];
		k42_avg = new int[k42_person];
	}
	public void SetData(int k42_i, String k42_str, int k42_score1, int k42_score2, int k42_score3) {
		///���� �������� ���� ���� �迭�� �����Ѵ�
		k42_num[k42_i] = k42_i; k42_name[k42_i] = k42_str;
		k42_kor[k42_i] = k42_score1; k42_eng[k42_i] = k42_score2; k42_mat[k42_i] = k42_score3;
		k42_sum[k42_i] = k42_kor[k42_i] + k42_eng[k42_i] + k42_mat[k42_i]; //�հ�
		k42_avg[k42_i] = k42_sum[k42_i] / 3; //���
	}
	
	
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
