package sw06;

public class Calc1 {
	public int sum(int k42_a, int k42_b, int k42_c) { //�Ű����� 3��
		return k42_a + k42_b + k42_c;
	}
	public int sum(int k42_a, int k42_b, int k42_c, int k42_d) { //�Ű����� 4��
		return k42_a + k42_b + k42_c + k42_d;
	}
	public int sum(int k42_a, int k42_b, int k42_c, int k42_d, int k42_e) { //�Ű����� 5��
		return k42_a + k42_b + k42_c + k42_d + k42_e;
	}
	public double getAvg(int k42_a, int k42_b, int k42_c, int k42_d, int k42_e, int k42_cnt) {
		return sum(k42_a, k42_b, k42_c, k42_d, k42_e) / k42_cnt;
	}
	
	//�Ű����� 3��
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_sum, double k42_avg) {
		System.out.printf("%d�� ����ǥ\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", //����� �Ҽ��� 2�ڸ����� ���
				k42_name, k42_a, k42_b, k42_c, k42_sum, k42_avg);
		System.out.println("=============================================================="); //���м�
	}
	//�Ű����� 4��
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_d, int k42_sum, double k42_avg) {
		System.out.printf("%d�� ����ǥ\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", //����� �Ҽ��� 2�ڸ����� ���
				k42_name, k42_a, k42_b, k42_c, k42_d, k42_sum, k42_avg);
		System.out.println("=============================================================="); //���м�
	}
	//�Ű����� 5��
	public void printer(int k42_month, String k42_name, int k42_a, int k42_b, int k42_c, int k42_d, int k42_e, int k42_sum, double k42_avg) {
		System.out.printf("%d�� ����ǥ\n", k42_month);
		System.out.println("--------------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t��ȸ\t����\t���");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", //����� �Ҽ��� 2�ڸ����� ���
				k42_name, k42_a, k42_b, k42_c, k42_d, k42_e, k42_sum, k42_avg);
		System.out.println("=============================================================="); //���м�
	}
	//���� ���� �����ϴ� �Լ�
	public int getRand() {
		int k42_rand = (int) (Math.random() * 50 + 50); //50~100������ ���Ƿ� ������ ���
		return k42_rand; //������ ��ȯ
	}
}
